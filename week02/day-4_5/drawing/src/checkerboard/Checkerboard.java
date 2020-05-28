package checkerboard;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        for (int i = 0; i < WIDTH; i += 80) {
            graphics.setColor(Color.black);
            int w = 40;
            int h = 40;
            graphics.fillRect(i, 0, w, h);
        }
        for (int i = 40; i < WIDTH; i += 80) {
            graphics.setColor(Color.black);
            int w = 40;
            int h = 40;
            graphics.fillRect(i, 40, w, h);
        }
        for (int i = 0; i < WIDTH; i += 80) {
            graphics.setColor(Color.black);
            int w = 40;
            int h = 40;
            graphics.fillRect(i, 80, w, h);
        }
        for (int i = 40; i < WIDTH; i += 80) {
            graphics.setColor(Color.black);
            int w = 40;
            int h = 40;
            graphics.fillRect(i, 120, w, h);
        }
        for (int i = 0; i < WIDTH; i += 80) {
            graphics.setColor(Color.black);
            int w = 40;
            int h = 40;
            graphics.fillRect(i, 160, w, h);
        }
        for (int i = 40; i < WIDTH; i += 80) {
            graphics.setColor(Color.black);
            int w = 40;
            int h = 40;
            graphics.fillRect(i, 200, w, h);
        }
        for (int i = 0; i < WIDTH; i += 80) {
            graphics.setColor(Color.black);
            int w = 40;
            int h = 40;
            graphics.fillRect(i, 240, w, h);
        }
        for (int i = 40; i < WIDTH; i += 80) {
            graphics.setColor(Color.black);
            int w = 40;
            int h = 40;
            graphics.fillRect(i, 280, w, h);
        }


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
