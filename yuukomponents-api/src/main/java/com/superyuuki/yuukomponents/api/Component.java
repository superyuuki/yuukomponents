package com.superyuuki.yuukomponents.api;

public interface Component<R> {

    Event generic(R root, Event untyped); //return the untyped when you are done processing it

}
