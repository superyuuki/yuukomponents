package com.superyuuki.yuukomponents.minecraft.core;

import com.superyuuki.yuukomponents.api.Component;
import com.superyuuki.yuukomponents.api.Event;
import com.superyuuki.yuukomponents.minecraft.ItemConstructor;

import java.util.UUID;

public interface Components extends Component<Void> {

    Event fire(UUID uuid, Event event);

    void add(ItemConstructor constructor);


}
