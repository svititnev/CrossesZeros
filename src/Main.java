import models.Game;
import views.GameView;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int t = 1;

        t++;

        t +=10;

        t += 20;

        Game game = new Game();

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameView();
            }
        });

    }

}
