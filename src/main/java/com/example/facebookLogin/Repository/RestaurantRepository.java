package com.example.facebookLogin.Repository;

import com.example.facebookLogin.Data.MenuData;
import com.example.facebookLogin.Data.RestaurantData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantData, String> {
    List<RestaurantData> findByMenu(MenuData menu);
}
