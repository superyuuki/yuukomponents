package com.superyuuki.yuukomponents.minecraft;

import com.superyuuki.yuukomponents.minecraft.item.Item;

import java.util.UUID;

public interface ItemConstructor {

    Item construct(UUID self);

}
