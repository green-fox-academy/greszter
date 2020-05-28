package colored_box;

import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class ColoredBox {

    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.

        int margin = 10;
        int sideA = 50;
        int sideB = 70;

        graphics.setColor(Color.RED);
        graphics.drawLine(0 + margin, 0 + margin, sideA + margin, 0 + margin);
        graphics.setColor(Color.BLUE);
        graphics.drawLine(sideA + margin, 0 + margin, sideA + margin, sideB + margin);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(sideA + margin, sideB + margin, 0 + margin, sideB + margin);
        graphics.setColor(Color.MAGENTA);
        graphics.drawLine(0 + margin, 0 + margin, 0 + margin, sideB + margin);

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
