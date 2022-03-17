package com.superyuuki.yuukomponents.api;

public interface Component<R> {

    boolean generic(R root, Event untyped); //return whether to pass forward


}
