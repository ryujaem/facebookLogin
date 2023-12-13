package com.example.facebookLogin.Repository;

import com.example.facebookLogin.Data.FavoriteData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface FavoriteRepository extends JpaRepository<FavoriteData, String> {
}
