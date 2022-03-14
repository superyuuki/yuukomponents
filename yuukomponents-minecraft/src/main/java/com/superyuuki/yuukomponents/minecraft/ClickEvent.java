package com.superyuuki.yuukomponents.minecraft;

import com.superyuuki.yuukomponents.api.Event;

public class ClickEvent implements Event {

    private final int x;

    public ClickEvent(int x) {
        this.x = x;
    }

    public int x() {
        return x;
    }
}
