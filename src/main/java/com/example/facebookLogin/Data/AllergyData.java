package com.example.facebookLogin.Data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ALLERGY_TB")
public class AllergyData {

    @Id
    @Column(name = "USER_id")
    private String USER_id;

    @Builder.Default
    @Column(name = "seafood")
    private int seafood = 0;

    @Builder.Default
    @Column(name = "lactose")
    private int lactose = 0;

    @Builder.Default
    @Column(name = "peach")
    private int peach = 0;

    @Builder.Default
    @Column(name = "beef")
    private int beef = 0;

    @Builder.Default
    @Column(name = "pork")
    private int pork = 0;

    @Builder.Default
    @Column(name = "corn")
    private int corn = 0;

    @Builder.Default
    @Column(name = "mushroom")
    private int mushroom = 0;

    @Builder.Default
    @Column(name = "broccoli")
    private int broccoli = 0;

    @Builder.Default
    @Column(name = "peanut")
    private int peanut = 0;

    @Builder.Default
    @Column(name = "crustaceans")
    private int crustaceans = 0;

    @Builder.Default
    @Column(name = "pepper")
    private int pepper = 0;

    @Builder.Default
    @Column(name = "eggs")
    private int eggs = 0;
}

