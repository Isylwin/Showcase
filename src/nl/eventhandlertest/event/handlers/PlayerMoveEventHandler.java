package nl.eventhandlertest.event.handlers;

import nl.eventhandlertest.Game;
import nl.eventhandlertest.event.framework.Handler;
import nl.eventhandlertest.model.Player;
import nl.eventhandlertest.event.events.PlayerMoveEvent;

import java.awt.*;

/**
 * @author Oscar de Leeuw
 */
public class PlayerMoveEventHandler implements Handler<PlayerMoveEvent> {

    @Override
    public void onEvent(PlayerMoveEvent event, Game game) {
        Player player = event.getPlayer();
        Point next = event.getTo();

        player.setLocation(next);
    }
}
