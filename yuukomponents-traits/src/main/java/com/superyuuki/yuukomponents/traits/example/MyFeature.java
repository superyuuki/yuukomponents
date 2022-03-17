package com.superyuuki.yuukomponents.traits.example;

import com.superyuuki.yuukomponents.traits.Context;
import com.superyuuki.yuukomponents.traits.constructor.UserTraitCtor;
import com.superyuuki.yuukomponents.traits.example.other.Otherable;
import com.superyuuki.yuukomponents.traits.keep.Trait;

public class MyFeature implements UserTraitCtor {

    private int saved;

    @Override
    public Trait make(Context context) {
        return new Lambda(context);
    }

    class Lambda implements Shootable, Otherable {

        private final Context context;

        Lambda(Context context) {
            this.context = context;
        }

        @Override
        public void interact() {
            saved++;
        }

        @Override
        public int damage(int shots, int damagePerShot) {
            return saved;
        }

        @Override
        public void dane() {

        }
    }
}
