package nl.eventhandlertest.event.framework;

/**
 * Created by Oscar on 19-10-2016.
 */
public interface Handler<E extends Event> {
    void onEvent(E event);
}
