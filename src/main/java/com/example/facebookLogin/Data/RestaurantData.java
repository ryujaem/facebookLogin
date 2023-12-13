package com.example.facebookLogin.Data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RESTAURANTS_TB")
public class RestaurantData {

    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;

    @Column(name = "content")
    private String content;

    @Column(name = "tel")
    private String tel;

    @Column(name = "date")
    private String time;

    @ManyToOne
    @JoinColumn(name = "menu")
    private MenuData menu;

    @Column(name = "image")
    private String image;
}
