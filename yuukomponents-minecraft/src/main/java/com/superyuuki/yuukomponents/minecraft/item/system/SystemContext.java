package com.superyuuki.yuukomponents.minecraft.item.system;

import com.superyuuki.yuukomponents.api.Event;

import java.util.UUID;

public interface SystemContext {

    Event asKeyed(UUID uuid, Event event);
    Event asSelf(Event event);

}
