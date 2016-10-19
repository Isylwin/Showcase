package nl.eventhandlertest.event.handlers;

import nl.eventhandlertest.Game;
import nl.eventhandlertest.model.Player;
import nl.eventhandlertest.event.events.PlayerMoveEvent;

import java.awt.*;

/**
 * @author Oscar de Leeuw
 */
public class PlayerMoveEventHandler extends EventHandler<PlayerMoveEvent>{

    public PlayerMoveEventHandler(Game game) {
        super(game);
    }

    @Override
    public void onEvent(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        Point next = event.getTo();

        game.getEventController();

        player.setLocation(next);
        event.setLogging(true);
    }
}
