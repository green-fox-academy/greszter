package function_to_center;

import javax.swing.*;

import java.awt.*;
import java.util.HashMap;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.


        for (int y = 0; y < WIDTH; y += 20) {
            graphics.setColor(Color.ORANGE);
            drawLine(0, y, graphics);
        }
        for (int y = 0; y < WIDTH; y += 20){
            graphics.setColor(Color.RED);
            drawLine(HEIGHT, y, graphics);
        }
        for (int x = 0; x < HEIGHT; x += 20){
            graphics.setColor(Color.BLUE);
            drawLine(x, 0, graphics);
        }
        for (int x = 0; x < HEIGHT; x += 20){
            graphics.setColor(Color.GREEN);
            drawLine(x, WIDTH, graphics);
        }

    }

    public static void drawLine(int x, int y, Graphics g){
        int x2 = WIDTH / 2;
        int y2 = HEIGHT / 2;
        g.drawLine(x, y, x2, y2);
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
