package envelope_star;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics){

        for (int i = 0; i < 160; i += 16) {
            graphics.setColor(Color.BLUE);
            graphics.drawLine( i, HEIGHT / 2, WIDTH / 2, (HEIGHT / 2) - i);
        }
        for (int i = 0; i < 160; i += 16) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(WIDTH / 2, i, (WIDTH / 2) + i, HEIGHT / 2);
        }
        for (int i = 0; i < 160; i += 16) {
            graphics.setColor(Color.RED);
            graphics.drawLine( (WIDTH / 2) - i, HEIGHT / 2, WIDTH / 2, HEIGHT - i);
        }
        for (int i = 0; i < 160; i += 16) {
            graphics.setColor(Color.ORANGE);
            graphics.drawLine(WIDTH / 2, (HEIGHT / 2) + i, WIDTH - i, HEIGHT / 2);
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
