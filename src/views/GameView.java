package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameView {

    public XOButton[][] buttons = new XOButton[3][3];

    public GameView() {

        JFrame frame = new JFrame("Крестики-нолики");

        frame.setSize(400, 400);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(3, 3);

        frame.setLayout(grid);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                XOButton button = new XOButton(""+i+","+j);
                button.setXY(i, j);
                frame.add(button);
                buttons[i][j] = button;

                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //int x = button.getX();
                        //int y = button.getY();
                        //System.out.println("" + x + "; " + y);
                    }
                });

            }
        }

        frame.setVisible(true);

    }
}
