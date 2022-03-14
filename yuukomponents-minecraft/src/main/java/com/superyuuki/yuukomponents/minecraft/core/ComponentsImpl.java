package com.superyuuki.yuukomponents.minecraft.core;

import com.superyuuki.yuukomponents.api.Event;
import com.superyuuki.yuukomponents.minecraft.ItemConstructor;
import com.superyuuki.yuukomponents.minecraft.item.Item;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class ComponentsImpl implements Components { //it doesnt care

    private final Map<UUID, Item> compUUIDs = new ConcurrentHashMap<>(); //mutable component block

    @Override
    public Event generic(Void root, Event untyped) {
        Event cur = untyped;

        for (var entry : compUUIDs.entrySet()) {
            cur = entry.getValue().generic(this, untyped);
        }

        return cur;
    }

    @Override
    public Event fire(UUID uuid, Event event) {

        var comp = compUUIDs.get(uuid);
        if (comp == null) return event;

        return comp.generic(this, event);
    }

    @Override
    public void add(ItemConstructor constructor) {
        UUID uuid = UUID.randomUUID();

        compUUIDs.put(
                uuid,
                constructor.construct(uuid)
        );


    }

}
