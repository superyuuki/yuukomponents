package com.superyuuki.yuukomponents.minecraft.item.system;

import com.superyuuki.yuukomponents.api.Event;
import com.superyuuki.yuukomponents.minecraft.core.Components;
import com.superyuuki.yuukomponents.minecraft.item.Item;

import java.util.UUID;

public class SystemContextImpl implements SystemContext {

    private final Components components;
    private final Item item;

    public SystemContextImpl(Components components, Item item) {
        this.components = components;
        this.item = item;
    }

    @Override
    public Event asKeyed(UUID uuid, Event event) {
        return components.fire(uuid, event);
    }

    @Override
    public Event asSelf(Event event) {
        return item.generic(components, event);
    }
}
