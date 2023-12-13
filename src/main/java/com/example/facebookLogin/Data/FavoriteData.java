package com.example.facebookLogin.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FAVORITE_TB")
public class FavoriteData {

    @Id
    @Column(name = "USER_id")
    private String USER_id;

    @Column(name = "spicy")
    private int spicy;

    @Column(name = "bitter")
    private int bitter;

    @Column(name = "sweet")
    private int sweet;

    @Column(name = "sour")
    private int sour;

    @Column(name = "salty")
    private int salty;

}
