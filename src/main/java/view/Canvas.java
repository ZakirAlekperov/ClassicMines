package view;

import javax.swing.*;
import java.awt.*;

import static constant.Constants.FIELD_SIZE;

class Canvas extends JPanel {

    private Cell[][] field;
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            for (int x = 0; x < FIELD_SIZE; x++)
                for (int y = 0; y < FIELD_SIZE; y++) field[y][x].paint(g, x, y);
        }

    public void setField(Cell[][] field) {
        this.field = field;
    }
}