package com.superyuuki.yuukomponents.traits.compiled;

import com.superyuuki.yuukomponents.api.Component;
import com.superyuuki.yuukomponents.traits.constructor.TraitToComponent;
import com.superyuuki.yuukomponents.traits.constructor.ComponentToTrait;
import com.superyuuki.yuukomponents.traits.keep.Trait;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyRegister implements Register {

    private final Map<Class<? extends Trait>, ComponentToTrait<?>> tccs = new HashMap<>();
    private final List<TraitToComponent<?>> ctcs = new ArrayList<>();

    @Override
    public <T extends Trait> void registerTrait(Class<T> trait, ComponentToTrait<T> tcc, TraitToComponent<T> ctc) {

    }

    @Override
    public <T extends Trait> T of(Class<T> clazz, Component<Void> component) {
       var ctor = tccs.get(clazz);
       if (ctor == null) throw new IllegalStateException("not present");

       return clazz.cast(ctor.make(component));
    }


}
