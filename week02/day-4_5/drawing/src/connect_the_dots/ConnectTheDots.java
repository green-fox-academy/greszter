package connect_the_dots;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 2 parameters:
        // An array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}

        List<List<Integer>> points = new ArrayList<>(Arrays.asList(Arrays.asList(10, 10), Arrays.asList(290,  10),
                Arrays.asList(290, 290), Arrays.asList(10, 290)));
        drawLine(points, graphics);

        List<List<Integer>> points2 = new ArrayList<>(Arrays.asList(Arrays.asList(50, 100), Arrays.asList(70, 70),
                Arrays.asList(80, 90), Arrays.asList(90, 90), Arrays.asList(100, 70), Arrays.asList(120, 100),
                Arrays.asList(85, 130), Arrays.asList(50, 100)));
        drawLine(points2, graphics);
    }


    public static void drawLine(List<List<Integer>> coordinates, Graphics g){
        for (int i = 0; i < coordinates.size() - 1; i++) {
            g.setColor(Color.GREEN);
            g.drawLine(coordinates.get(i).get(0), coordinates.get(i).get(1), coordinates.get(i + 1).get(0),
                    coordinates.get(i + 1).get(1));
        }
        g.drawLine(coordinates.get(coordinates.size() - 1).get(0), coordinates.get(coordinates.size() - 1).get(1),
                coordinates.get(0).get(0), coordinates.get(0).get(1));
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
