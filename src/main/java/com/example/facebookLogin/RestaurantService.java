package com.example.facebookLogin;

import com.example.facebookLogin.Data.AllergyData;
import com.example.facebookLogin.Data.QMenuData;
import com.example.facebookLogin.Data.QRestaurantData;
import com.example.facebookLogin.Data.RestaurantData;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    private JPAQueryFactory queryFactory;

    public List<RestaurantData> findAiRestaurant(AllergyData userAllergy) {

        System.out.println("userAllergy"+userAllergy);
        QRestaurantData restaurantData = QRestaurantData.restaurantData;
        QMenuData menuData = QMenuData.menuData;

        // 조건 정의
        BooleanBuilder builder = new BooleanBuilder();
        if (userAllergy.getSeafood() == 1) {
            builder.and(menuData.seafood.isFalse());
        }

        if (userAllergy.getLactose() == 1) {
            builder.and(menuData.lactose.isFalse());
        }

        if (userAllergy.getPeach() == 1) {
            builder.and(menuData.peach.isFalse());
        }


        if (userAllergy.getBeef() == 1) {
            builder.and(menuData.beef.isFalse());
        }
//
        if (userAllergy.getPork() == 1) {
            builder.and(menuData.pork.isFalse());
        }

        if (userAllergy.getCorn() == 1) {
            builder.and(menuData.corn.isFalse());
        }

        if (userAllergy.getMushroom() == 1) {
            builder.and(menuData.mushroom.isFalse());
        }

        if (userAllergy.getBroccoli() == 1) {
            builder.and(menuData.broccoli.isFalse());
        }

        if (userAllergy.getPeanut() == 1) {
            builder.and(menuData.peanut.isFalse());
        }

        if (userAllergy.getCrustaceans() == 1) {
            builder.and(menuData.crustaceans.isFalse());
        }

        if (userAllergy.getPepper() == 1) {
            builder.and(menuData.pepper.isFalse());
        }

        if (userAllergy.getEggs() == 1) {
            builder.and(menuData.eggs.isFalse());
        }


        List<RestaurantData> list = queryFactory
                .selectFrom(restaurantData)
                .join(restaurantData.menu, menuData) // 수정된 부분
                .where(builder)
                .fetch();
        System.out.println(list.size());
        // 쿼리 생성
        return list;
    }

}