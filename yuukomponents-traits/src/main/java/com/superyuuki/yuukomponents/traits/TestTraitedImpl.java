package com.superyuuki.yuukomponents.traits;

import java.util.UUID;

//one test trait exists for every system
public class TestTraitedImpl implements TestTraited<Ctx>, SomeOtherTraited<Ctx> {


    @Override
    public void interact(Ctx ctx) {

    }

    @Override
    public int complexMethod(Ctx ctx, String name, UUID gun) {
        return 0;
    }

    @Override
    public void lmao() {

    }
}
