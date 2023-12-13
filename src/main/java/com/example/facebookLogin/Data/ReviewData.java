package com.example.facebookLogin.Data;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "GRADE_TB")
public class ReviewData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(name = "USER_id")
    private String userId;

    @Column(name = "hygiene")
    private Float hygiene;

    @Column(name = "service")
    private Float service;

    @Column(name = "variety")
    private Float variety;

    @Column(name = "taste")
    private Float taste;

    @Column(name = "design")
    private Float design;

    @Column(name = "average")
    private Float average;

    @Column(name = "RESTAURANTS_name")
    private String restaurantsName;

    @Column(name = "date")
    private String time;
}
