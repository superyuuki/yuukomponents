package com.superyuuki.yuukomponents.minecraft.feature;

import com.superyuuki.yuukomponents.api.Component;
import com.superyuuki.yuukomponents.minecraft.core.Components;
import com.superyuuki.yuukomponents.minecraft.item.VoidItemComponent;

import java.util.UUID;

public class FeatureContextImpl implements FeatureContext {

    private final Components components;
    private final Component<Components> item;

    public FeatureContextImpl(Components components, Component<Components> item) {
        this.components = components;
        this.item = item;
    }

    @Override
    public Component<Void> root() {
        return components;
    }

    @Override
    public Component<Void> item(UUID uuid) {
        return components.item(uuid);
    }

    @Override
    public Component<Void> parent() {
        return new VoidItemComponent(components, item);
    }
}
