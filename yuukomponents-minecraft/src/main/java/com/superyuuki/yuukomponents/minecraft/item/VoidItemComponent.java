package com.superyuuki.yuukomponents.minecraft.item;

import com.superyuuki.yuukomponents.api.Component;
import com.superyuuki.yuukomponents.api.Event;
import com.superyuuki.yuukomponents.minecraft.core.Components;

public class VoidItemComponent implements Component<Void> {

    private final Components components;
    private final Component<Components> item;

    public VoidItemComponent(Components components, Component<Components> item) {
        this.components = components;
        this.item = item;
    }

    @Override
    public boolean generic(Void root, Event untyped) {
        return item.generic(components, untyped);
    }
}
