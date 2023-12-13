package com.example.facebookLogin.Repository;

import com.example.facebookLogin.Data.ReviewData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReviewRepository extends JpaRepository<ReviewData, String> {

    List<ReviewData> findByRestaurantsName(String restaurantsName);

    @Query("SELECT AVG(r.average) FROM ReviewData r WHERE r.restaurantsName = :restaurantsName")
    Float findAveragesByRestaurantsName(@Param("restaurantsName") String restaurantsName);

}
