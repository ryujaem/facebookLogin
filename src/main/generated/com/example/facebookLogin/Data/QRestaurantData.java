package com.example.facebookLogin.Data;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRestaurantData is a Querydsl query type for RestaurantData
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRestaurantData extends EntityPathBase<RestaurantData> {

    private static final long serialVersionUID = -281607825L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRestaurantData restaurantData = new QRestaurantData("restaurantData");

    public final StringPath address = createString("address");

    public final StringPath content = createString("content");

    public final StringPath image = createString("image");

    public final StringPath latitude = createString("latitude");

    public final StringPath longitude = createString("longitude");

    public final QMenuData menu;

    public final StringPath name = createString("name");

    public final StringPath tel = createString("tel");

    public final StringPath time = createString("time");

    public QRestaurantData(String variable) {
        this(RestaurantData.class, forVariable(variable), INITS);
    }

    public QRestaurantData(Path<? extends RestaurantData> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRestaurantData(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRestaurantData(PathMetadata metadata, PathInits inits) {
        this(RestaurantData.class, metadata, inits);
    }

    public QRestaurantData(Class<? extends RestaurantData> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.menu = inits.isInitialized("menu") ? new QMenuData(forProperty("menu")) : null;
    }

}

