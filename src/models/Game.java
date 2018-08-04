package models;

public class Game {

    private Field field;
    private Figure currentPlayer;
    private Figure winner;

    public Game() {

        field = new Field();
        currentPlayer = Figure.X;
        winner = null;

    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Figure getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Figure currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public void changeCurrentPlayer() {

        if (currentPlayer == Figure.X) {
            currentPlayer = Figure.O;
        } else {
            currentPlayer = Figure.X;
        }

    }

    public void testWin() {

        Cell[][] cells = getField().getCells();

        for (int i = 0; i < 3; i++) {
            Figure figure = cells[i][0].getFigure();
            if (figure == null) {
                continue;
            }

            if ((cells[i][0].getFigure() == figure)
                && (cells[i][1].getFigure() == figure)
                    && (cells[i][2].getFigure() == figure)) {
                winner = figure;
                return;

            }
        }

        for (int i = 0; i < 3; i++) {
            Figure figure = cells[0][i].getFigure();
            if (figure == null) {
                continue;
            }

            if ((cells[0][i].getFigure() == figure)
                    && (cells[1][i].getFigure() == figure)
                    && (cells[2][i].getFigure() == figure)) {
                winner = figure;
                return;

            }
        }


        testDiagonal1(cells);
        testDiagonal2(cells);

    }

    private void testDiagonal1(Cell[][] cells) {

        Figure figure = cells[0][0].getFigure();
        if (figure == null) {
            return;
        }

        if ((cells[0][0].getFigure() == figure)
                && (cells[1][1].getFigure() == figure)
                && (cells[2][2].getFigure() == figure)) {
            winner = figure;
        }

    }

    private void testDiagonal2(Cell[][] cells) {

        Figure figure = cells[2][0].getFigure();
        if (figure == null) {
            return;
        }

        if ((cells[2][0].getFigure() == figure)
                && (cells[1][1].getFigure() == figure)
                && (cells[0][2].getFigure() == figure)) {
            winner = figure;
        }

    }

    public Figure getWinner() {
        return winner;
    }
}
