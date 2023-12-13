package com.example.facebookLogin.Repository;

import com.example.facebookLogin.Data.AllergyData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface AllergyRepository extends JpaRepository<AllergyData, String>, JpaSpecificationExecutor<AllergyData> {
    @Query(value = "SELECT ua.* FROM USER_ALLERGY ua " +
            "WHERE NOT EXISTS (" +
            "SELECT 1 FROM MENU m " +
            "WHERE ua.seafood = {m.seafood} " +
            "AND ua.lactose = m.lactose " +
            "AND ua.peach = m.peach " +
            "AND ua.pork = m.pork " +
            "AND ua.corn = m.corn " +
            "AND ua.mushroom = m.mushroom " +
            "AND ua.broccoli = m.broccoli " +
            "AND ua.peanut = m.peanut " +
            "AND ua.crustaceans = m.crustaceans " +
            "AND ua.pepper = m.pepper " +
            "AND ua.beef = m.beef " +
            "AND ua.eggs = m.eggs" +
            ")", nativeQuery = true)
    List<String> findMenuCodesByAllergies(@Param("userId") String userId);

}
