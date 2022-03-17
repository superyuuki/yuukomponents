package com.superyuuki.yuukomponents.minecraft.item;

import com.superyuuki.yuukomponents.api.Component;
import com.superyuuki.yuukomponents.minecraft.core.Components;

import java.util.UUID;

public interface ItemConstructor {

    Component<Components> construct(UUID self);

}
