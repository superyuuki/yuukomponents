package com.superyuuki.yuukomponents.systems.mono;

import com.superyuuki.yuukomponents.api.Component;

import java.util.UUID;

public interface IdentifiableFactory {

    Component make(UUID identity);

}
