package com.example.facebookLogin.Data;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMenuData is a Querydsl query type for MenuData
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMenuData extends EntityPathBase<MenuData> {

    private static final long serialVersionUID = 1932572817L;

    public static final QMenuData menuData = new QMenuData("menuData");

    public final BooleanPath beef = createBoolean("beef");

    public final BooleanPath broccoli = createBoolean("broccoli");

    public final StringPath code = createString("code");

    public final BooleanPath corn = createBoolean("corn");

    public final BooleanPath crustaceans = createBoolean("crustaceans");

    public final BooleanPath eggs = createBoolean("eggs");

    public final BooleanPath lactose = createBoolean("lactose");

    public final BooleanPath mushroom = createBoolean("mushroom");

    public final StringPath name = createString("name");

    public final BooleanPath peach = createBoolean("peach");

    public final BooleanPath peanut = createBoolean("peanut");

    public final BooleanPath pepper = createBoolean("pepper");

    public final BooleanPath pork = createBoolean("pork");

    public final BooleanPath seafood = createBoolean("seafood");

    public QMenuData(String variable) {
        super(MenuData.class, forVariable(variable));
    }

    public QMenuData(Path<? extends MenuData> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMenuData(PathMetadata metadata) {
        super(MenuData.class, metadata);
    }

}

