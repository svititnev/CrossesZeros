package views;

import models.Cell;
import models.Figure;
import models.Game;

import javax.swing.*;
import java.awt.*;

public class GameView {

    private CellButton[][] buttons = new CellButton[3][3];
    private Game game;
    private Game mGame;
    private JFrame frame;

    public GameView(Game game) {

        this.game = game;

        frame = new JFrame("Крестики-нолики");

        frame.setSize(400, 400);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(3, 3);

        frame.setLayout(grid);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                CellButton button = new CellButton(i, j, game, this);
                // button.setXY(i, j);
                frame.add(button);
                buttons[i][j] = button;
            }
        }

        updateField();

        frame.setVisible(true);


    }

    void updateField() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Cell cell = game.getField().getCells()[i][j];
                Figure figure = cell.getFigure();
                if (figure == null) {
                    buttons[i][j].setText("");
                } else {
                    buttons[i][j].setText(figure.toString());
                }
            }
        }

        if (game.getWinner()!=null) {
            frame.setTitle("Winner: " + game.getWinner());
        } else if (!game.getField().thereAreFreeCells()) {
            frame.setTitle("Ничья!");
        } else {
            frame.setTitle("Сейчас ходит " + game.getCurrentPlayer());
        }

    }

}
