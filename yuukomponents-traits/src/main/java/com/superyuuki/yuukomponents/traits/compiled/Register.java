package com.superyuuki.yuukomponents.traits.compiled;

import com.superyuuki.yuukomponents.api.Component;
import com.superyuuki.yuukomponents.traits.constructor.TraitToComponent;
import com.superyuuki.yuukomponents.traits.constructor.ComponentToTrait;
import com.superyuuki.yuukomponents.traits.keep.Trait;

public interface Register {

    <T extends Trait> void registerTrait(Class<T> trait, ComponentToTrait<T> tcc, TraitToComponent<T> ctc);

    <T extends Trait> T of(Class<T> clazz, Component<Void> component);


}
