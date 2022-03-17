package com.superyuuki.yuukomponents.minecraft.core;

import com.superyuuki.yuukomponents.api.Component;
import com.superyuuki.yuukomponents.minecraft.item.ItemConstructor;

import java.util.UUID;

public interface Components extends Component<Void> {

    void add(ItemConstructor constructor);

    Component<Void> item(UUID uuid);

}
