package models;

public class Field {

    private Cell[][] cells;

    Field() {

        cells = new Cell[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cells[i][j] = new Cell();
            }
        }

    }

    public Cell[][] getCells() {
        return cells;
    }

    public boolean thereAreFreeCells() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (cells[i][j].getFigure() == null) {
                    return true;
                }
            }
        }

        return false;

    }

}
