package views;

import models.Cell;
import models.Game;

import javax.swing.*;

class CellButton extends JButton {

    final private int x;
    final private int y;
    private Game game;
    private GameView gameView;

    CellButton(int x, int y, Game game, GameView gameView) {
        this.x = x;
        this.y = y;
        this.game = game;
        this.gameView = gameView;

        setText("" + x + ";" + y);

        addActionListener(e -> {

            Cell cell = game.getField().getCells()[x][y];

            if (cell.getFigure() != null) {
                return;
            }

            if (game.getWinner() != null) {
                return;
            }

            cell.setFigure(game.getCurrentPlayer());
            game.testWin();
            game.changeCurrentPlayer();
            gameView.updateField();

        });

    }
}
