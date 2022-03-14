package com.superyuuki.yuukomponents.traits;

import java.util.UUID;

//i hate traits
public interface TestTraited<C> extends Traited<C> {

    void interact(C ctx);
    default void interact() {
        interact(null); //oh boy
    }

    int complexMethod(C ctx, String name, UUID gun);
    default int complexMethod(String name, UUID gun) {
        return complexMethod(null, name, gun);
    }


}
