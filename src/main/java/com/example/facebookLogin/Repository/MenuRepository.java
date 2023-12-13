package com.example.facebookLogin.Repository;

import com.example.facebookLogin.Data.MenuData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository  extends JpaRepository<MenuData, String> {
}
