package com.superyuuki.yuukomponents.traits.constructor;

import com.superyuuki.yuukomponents.api.Component;
import com.superyuuki.yuukomponents.traits.keep.Trait;

public interface TraitToComponent<T extends Trait> {

    Component<Void> make(T trait);

}
