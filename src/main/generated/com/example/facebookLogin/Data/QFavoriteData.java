package com.example.facebookLogin.Data;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QFavoriteData is a Querydsl query type for FavoriteData
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFavoriteData extends EntityPathBase<FavoriteData> {

    private static final long serialVersionUID = 1968394830L;

    public static final QFavoriteData favoriteData = new QFavoriteData("favoriteData");

    public final NumberPath<Integer> bitter = createNumber("bitter", Integer.class);

    public final NumberPath<Integer> salty = createNumber("salty", Integer.class);

    public final NumberPath<Integer> sour = createNumber("sour", Integer.class);

    public final NumberPath<Integer> spicy = createNumber("spicy", Integer.class);

    public final NumberPath<Integer> sweet = createNumber("sweet", Integer.class);

    public final StringPath USER_id = createString("USER_id");

    public QFavoriteData(String variable) {
        super(FavoriteData.class, forVariable(variable));
    }

    public QFavoriteData(Path<? extends FavoriteData> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFavoriteData(PathMetadata metadata) {
        super(FavoriteData.class, metadata);
    }

}

