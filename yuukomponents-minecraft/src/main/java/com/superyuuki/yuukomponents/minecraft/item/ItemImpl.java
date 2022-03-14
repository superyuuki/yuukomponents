package com.superyuuki.yuukomponents.minecraft.item;

import com.superyuuki.yuukomponents.api.Event;
import com.superyuuki.yuukomponents.minecraft.core.Components;
import com.superyuuki.yuukomponents.minecraft.item.system.SystemContextImpl;
import com.superyuuki.yuukomponents.minecraft.item.system.System;

import java.util.List;

public class ItemImpl implements Item {

    private final List<System> systems;

    public ItemImpl(List<System> systems) {
        this.systems = systems;
    }


    @Override
    public Event generic(Components root, Event untyped) {
        Event top = untyped;

        for (System system : systems) {
            top = system.generic(new SystemContextImpl(root, this), top);
        }

        return top;
    }
}
