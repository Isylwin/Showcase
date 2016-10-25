package nl.eventhandlertest.event;

import nl.eventhandlertest.Game;
import nl.eventhandlertest.event.events.PlayerMoveEvent;
import nl.eventhandlertest.event.framework.Event;
import nl.eventhandlertest.event.framework.EventDispatcher;
import nl.eventhandlertest.event.handlers.PlayerMoveEventHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * The EventController is a class that controls the event system within the game.
 *
 * @author Oscar de Leeuw
 */
public class EventController {
    private EventDispatcher dispatcher;
    private List<Event> eventLog;

    public EventController() {
        this.eventLog = new ArrayList<>();
        this.dispatcher = new EventDispatcher();
        registerAllEvents();
    }

    /**
     * Gets a log of fired events.
     *
     * @return A list of all the events that have been fired.
     */
    public List<Event> getEventLog() {
        return eventLog;
    }

    /**
     * Registers all the events with their corresponding eventHandler.
     */
    protected void registerAllEvents() {
        this.dispatcher.registerHandler(PlayerMoveEvent.class, new PlayerMoveEventHandler());
    }

    /**
     * Fires a given event.
     * Requires the game for handling the event.
     *
     * @param event The event that should be fired.
     * @param game The game on which the eventHandler can execute the event.
     */
    public void fireEvent(Event event, Game game) {
        dispatcher.dispatch(event, game);
        logEvent(event);
    }

    /**
     * Logs a given event.
     * @param event The event to log.
     */
    private void logEvent(Event event) {
        if(!eventLog.contains(event)) {
            eventLog.add(event);
        }
    }
}
