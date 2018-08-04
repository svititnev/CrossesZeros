import models.Game;
import views.GameView;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();

        SwingUtilities.invokeLater(() -> new GameView(game));

    }

}
