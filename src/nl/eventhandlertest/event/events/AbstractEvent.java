package nl.eventhandlertest.event.events;

import nl.eventhandlertest.event.framework.Event;

/**
 * Created by Oscar on 19-10-2016.
 */
public abstract class AbstractEvent implements Event {
    private boolean shouldBeLogged;

    @Override
    public Class<? extends Event> getType() {
        return getClass();
    }

    @Override
    public boolean shouldBeLogged() {
        return shouldBeLogged;
    }

    @Override
    public void setLogging(boolean bool) {
        shouldBeLogged = bool;
    }
}
