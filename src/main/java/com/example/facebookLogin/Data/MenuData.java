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
@Table(name = "MENU_TB")
public class MenuData {

    @Id
    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "seafood")
    private Boolean seafood;

    @Column(name = "lactose")
    private Boolean lactose;

    @Column(name = "peach")
    private Boolean peach;

    @Column(name = "beef")
    private Boolean beef;

    @Column(name = "pork")
    private Boolean pork;

    @Column(name = "corn")
    private Boolean corn;

    @Column(name = "mushroom")
    private Boolean mushroom;

    @Column(name = "broccoli")
    private Boolean broccoli;

    @Column(name = "peanut")
    private Boolean peanut;

    @Column(name = "crustaceans")
    private Boolean crustaceans;

    @Column(name = "pepper")
    private Boolean pepper;

    @Column(name = "eggs")
    private Boolean eggs;
}
