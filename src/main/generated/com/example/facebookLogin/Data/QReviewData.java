package com.example.facebookLogin.Data;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QReviewData is a Querydsl query type for ReviewData
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReviewData extends EntityPathBase<ReviewData> {

    private static final long serialVersionUID = 755162122L;

    public static final QReviewData reviewData = new QReviewData("reviewData");

    public final NumberPath<Float> average = createNumber("average", Float.class);

    public final NumberPath<Float> design = createNumber("design", Float.class);

    public final NumberPath<Float> hygiene = createNumber("hygiene", Float.class);

    public final StringPath id = createString("id");

    public final StringPath restaurantsName = createString("restaurantsName");

    public final NumberPath<Float> service = createNumber("service", Float.class);

    public final NumberPath<Float> taste = createNumber("taste", Float.class);

    public final StringPath time = createString("time");

    public final StringPath userId = createString("userId");

    public final NumberPath<Float> variety = createNumber("variety", Float.class);

    public QReviewData(String variable) {
        super(ReviewData.class, forVariable(variable));
    }

    public QReviewData(Path<? extends ReviewData> path) {
        super(path.getType(), path.getMetadata());
    }

    public QReviewData(PathMetadata metadata) {
        super(ReviewData.class, metadata);
    }

}

