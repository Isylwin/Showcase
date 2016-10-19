package nl.eventhandlertest.model;

import nl.eventhandlertest.event.EventController;
import nl.eventhandlertest.event.events.PlayerMoveEvent;

import java.awt.*;

/**
 * Created by Oscar on 19-10-2016.
 */
public class Player {
    private Point location;
    private Point translation;

    public Player(Point location, Point translation) {
        this.location = location;
        this.translation = translation;
    }

    public void update(EventController controller) {
        Point next = new Point(location);
        next.translate(translation.x, translation.y);
        PlayerMoveEvent event = new PlayerMoveEvent(this, location, next);

        controller.fireEvent(event);
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }
}
