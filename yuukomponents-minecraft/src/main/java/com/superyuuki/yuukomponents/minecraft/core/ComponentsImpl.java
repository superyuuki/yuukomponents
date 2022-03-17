package com.superyuuki.yuukomponents.minecraft.core;

import com.superyuuki.yuukomponents.api.Component;
import com.superyuuki.yuukomponents.api.Event;
import com.superyuuki.yuukomponents.minecraft.item.ItemConstructor;
import com.superyuuki.yuukomponents.minecraft.item.VoidItemComponent;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class ComponentsImpl implements Components { //it doesnt care

    private final Map<UUID, Component<Components>> compUUIDs = new ConcurrentHashMap<>(); //mutable component block

    @Override
    public boolean generic(Void root, Event untyped) {
        for (var entry : compUUIDs.entrySet()) {
            entry.getValue().generic(this, untyped);
        }

        return true;
    }

    @Override
    public void add(ItemConstructor constructor) {
        UUID uuid = UUID.randomUUID();

        compUUIDs.put(
                uuid,
                constructor.construct(uuid)
        );
    }

    @Override
    public Component<Void> item(UUID uuid) {
        Component<Components> item = compUUIDs.get(uuid);

        if (item == null) throw new IllegalArgumentException("No such item with uuid: " + uuid);

        return new VoidItemComponent(this, item);
    }

}
