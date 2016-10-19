package nl.eventhandlertest.event;

import nl.eventhandlertest.Game;
import nl.eventhandlertest.event.events.PlayerMoveEvent;
import nl.eventhandlertest.event.framework.Event;
import nl.eventhandlertest.event.framework.EventDispatcher;
import nl.eventhandlertest.event.handlers.PlayerMoveEventHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oscar on 19-10-2016.
 */
public class EventController {
    private EventDispatcher dispatcher;
    private List<Event> eventLog;
    private Game game;

    public EventController(Game game) {
        this.game = game;
        this.eventLog = new ArrayList<>();
        this.dispatcher = new EventDispatcher();
        registerAllEvents();
    }

    public List<Event> getEventLog() {
        return eventLog;
    }

    protected void registerAllEvents() {
        this.dispatcher.registerHandler(PlayerMoveEvent.class, new PlayerMoveEventHandler(game));
    }

    public void fireEvent(Event event) {
        dispatcher.dispatch(event);

        if(event.shouldBeLogged()) {
            logEvent(event);
        }
    }

    private void logEvent(Event event) {
        if(!eventLog.contains(event)) {
            eventLog.add(event);
        }
    }
}
