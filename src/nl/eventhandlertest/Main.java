package nl.eventhandlertest;

import nl.eventhandlertest.model.Player;

import java.awt.*;

/**
 * Created by Oscar on 19-10-2016.
 */
public class Main {
    public static void main(String[] args) {
        Point start = new Point(0,0);
        Point move = new Point(1,1);

        Player gert = new Player(start, move);

        Game game = new Game(gert);

        for(int i = 0; i < 10; i++) {
            game.update();
            System.out.println(game.getPlayer().getLocation());
        }

    }
}
