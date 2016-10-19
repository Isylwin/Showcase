package nl.eventhandlertest.model;

import nl.eventhandlertest.event.events.PlayerMoveEvent;
import nl.eventhandlertest.event.framework.Event;

import java.awt.*;


/**
 * @author Oscar de Leeuw
 */
public class Player {
    private Point location;
    private Point translation;

    public Player(Point location, Point translation) {
        this.location = location;
        this.translation = translation;
    }

    /**
     * The update method is called every time the game updates.
     * This method should return an event that the player object would like to execute.
     *
     * @return The event the player would like to execute.
     */
    public Event update() {
        Point next = new Point(location);
        next.translate(translation.x, translation.y);
        return new PlayerMoveEvent(this, location, next);
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }
}
