package com.superyuuki.yuukomponents.traits.example;

import com.superyuuki.yuukomponents.traits.keep.Trait;

public interface Shootable extends Trait {

    void interact();
    int damage(int shots, int damagePerShot);

}
