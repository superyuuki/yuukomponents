package com.superyuuki.yuukomponents.minecraft.feature;

import com.superyuuki.yuukomponents.api.Component;

import java.util.UUID;

public interface FeatureContext {

    Component<Void> root();
    Component<Void> item(UUID uuid);
    Component<Void> parent();

}
