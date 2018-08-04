package views;

import javax.swing.*;

public class XOButton extends JButton {

    int x;
    int y;

    public XOButton(String text) {
        super(text);
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }
}
