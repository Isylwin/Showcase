package nl.eventhandlertest.event.handlers;

import nl.eventhandlertest.Game;
import nl.eventhandlertest.event.framework.Event;
import nl.eventhandlertest.event.framework.Handler;

/**
 * Created by Oscar on 19-10-2016.
 */
public abstract class EventHandler<E extends Event> implements Handler<E> {
    Game game;

    EventHandler(Game game) {
        this.game = game;
    }
}
