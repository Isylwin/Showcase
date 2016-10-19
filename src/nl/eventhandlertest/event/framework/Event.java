package nl.eventhandlertest.event.framework;

/**
 * Created by Oscar on 19-10-2016.
 */
public interface Event {
    Class<? extends Event> getType();
    boolean shouldBeLogged();
    void setLogging(boolean bool);
}
