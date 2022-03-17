package com.superyuuki.yuukomponents.traits.constructor;

import com.superyuuki.yuukomponents.api.Component;
import com.superyuuki.yuukomponents.traits.keep.Trait;

public interface ComponentToTrait<T extends Trait> {

    T make(Component<Void> component);

}
