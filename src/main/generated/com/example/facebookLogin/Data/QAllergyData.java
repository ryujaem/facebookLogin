package com.example.facebookLogin.Data;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAllergyData is a Querydsl query type for AllergyData
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAllergyData extends EntityPathBase<AllergyData> {

    private static final long serialVersionUID = 1799010146L;

    public static final QAllergyData allergyData = new QAllergyData("allergyData");

    public final NumberPath<Integer> beef = createNumber("beef", Integer.class);

    public final NumberPath<Integer> broccoli = createNumber("broccoli", Integer.class);

    public final NumberPath<Integer> corn = createNumber("corn", Integer.class);

    public final NumberPath<Integer> crustaceans = createNumber("crustaceans", Integer.class);

    public final NumberPath<Integer> eggs = createNumber("eggs", Integer.class);

    public final NumberPath<Integer> lactose = createNumber("lactose", Integer.class);

    public final NumberPath<Integer> mushroom = createNumber("mushroom", Integer.class);

    public final NumberPath<Integer> peach = createNumber("peach", Integer.class);

    public final NumberPath<Integer> peanut = createNumber("peanut", Integer.class);

    public final NumberPath<Integer> pepper = createNumber("pepper", Integer.class);

    public final NumberPath<Integer> pork = createNumber("pork", Integer.class);

    public final NumberPath<Integer> seafood = createNumber("seafood", Integer.class);

    public final StringPath USER_id = createString("USER_id");

    public QAllergyData(String variable) {
        super(AllergyData.class, forVariable(variable));
    }

    public QAllergyData(Path<? extends AllergyData> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAllergyData(PathMetadata metadata) {
        super(AllergyData.class, metadata);
    }

}

