package rainbow_boxes;

import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxes2 {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        Color[] colors = {Color.RED, Color.YELLOW, Color.GREEN, Color.BLUE, new Color(75, 0, 130), new Color(128, 0, 128)};

        for (int i = WIDTH, j = 0; i >= 0; i -= 5, j++) {
//            if (j == colors.length){
//                j = 0;
//            }
            j= j % colors.length;
            int size = i;
            drawSquare(size, colors[j], graphics);
        }
    }

    public static void drawSquare(int size, Color color, Graphics g) {
        int x = (WIDTH / 2) - (size / 2);
        int y = (HEIGHT / 2) - (size / 2);
        g.setColor(color);
        g.fillRect(x, y, size, size);
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
