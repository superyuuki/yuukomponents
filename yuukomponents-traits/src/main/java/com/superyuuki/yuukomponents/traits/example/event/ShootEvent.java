package com.superyuuki.yuukomponents.traits.example.event;

import com.superyuuki.yuukomponents.api.Event;

public record ShootEvent(int damage, int shots, int dps) implements Event {
}
