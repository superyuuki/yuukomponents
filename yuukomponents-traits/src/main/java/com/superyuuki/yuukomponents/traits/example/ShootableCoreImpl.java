package com.superyuuki.yuukomponents.traits.example;

import com.superyuuki.yuukomponents.api.Component;
import com.superyuuki.yuukomponents.traits.example.event.InteractEvent;
import com.superyuuki.yuukomponents.traits.example.event.ShootEvent;

public class ShootableCoreImpl implements Shootable {

    private final Component<Void> component;

    public ShootableCoreImpl(Component<Void> component) {
        this.component = component;
    }

    @Override
    public void interact() {
        component.generic(null, new InteractEvent());
    }

    @Override
    public int damage(int shots, int damagePerShot) {
        ShootEvent event = new ShootEvent(0, shots, damagePerShot);

        component.generic(null, event);

        return event.damage();
    }
}
