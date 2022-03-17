package com.superyuuki.yuukomponents.minecraft.item;

import com.superyuuki.yuukomponents.api.Component;
import com.superyuuki.yuukomponents.api.Event;
import com.superyuuki.yuukomponents.minecraft.core.Components;
import com.superyuuki.yuukomponents.minecraft.feature.Feature;
import com.superyuuki.yuukomponents.minecraft.feature.FeatureContextImpl;

import java.util.List;

public class ItemImpl implements Component<Components> {

    private final List<Feature> features;

    public ItemImpl(List<Feature> features) {
        this.features = features;
    }

    @Override
    public boolean generic(Components root, Event untyped) {

        for (Feature feature : features) {
            boolean proceed = feature.generic(
                    new FeatureContextImpl(root, this),
                    untyped
            );

            if (!proceed) return false;
        }

        return true;

    }
}
