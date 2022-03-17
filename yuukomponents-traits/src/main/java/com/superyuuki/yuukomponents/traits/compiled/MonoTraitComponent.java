package com.superyuuki.yuukomponents.traits.compiled;

import com.superyuuki.yuukomponents.api.Event;
import com.superyuuki.yuukomponents.minecraft.feature.Feature;
import com.superyuuki.yuukomponents.minecraft.feature.FeatureContext;

public class MonoTraitComponent implements Feature {
    @Override
    public boolean generic(FeatureContext root, Event untyped) {
        return false;
    }
}
