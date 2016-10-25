package nl.eventhandlertest;

import nl.eventhandlertest.event.EventController;
import nl.eventhandlertest.model.Player;

/**
 * Created by Oscar on 19-10-2016.
 */
public class Game {
    private Player player;
    private EventController eventController;

    public Game(Player player) {
        this.player = player;
        this.eventController = new EventController();
    }

    public EventController getEventController() {
        return eventController;
    }

    public void setEventController(EventController eventController) {
        this.eventController = eventController;
    }

    public Player getPlayer() {
        return player;
    }

    public void update() {
        eventController.fireEvent(player.update(), this);
    }
}
