package nl.eventhandlertest.event.events;

import nl.eventhandlertest.model.Player;

import java.awt.*;

/**
 * Created by Oscar on 19-10-2016.
 */
public class PlayerMoveEvent extends AbstractEvent {
    private Point from;
    private Point to;
    private Player player;

    public PlayerMoveEvent(Player player, Point from, Point to) {
        this.from = from;
        this.player = player;
        this.to = to;
    }

    public Point getFrom() {
        return from;
    }

    public Point getTo() {
        return to;
    }

    public Player getPlayer() {
        return player;
    }
}
