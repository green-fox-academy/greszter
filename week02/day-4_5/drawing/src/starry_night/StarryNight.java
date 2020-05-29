package starry_night;

import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

//        graphics.setColor(Color.BLACK);
//        graphics.fillRect(0, 0, WIDTH, HEIGHT);


        for (int i = 0; i < 300; i++) {
            Random random = new Random();
            graphics.setColor(getGrey());
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);
            int w = random.nextInt(20);
            graphics.fillOval(x, y, w, w);
        }
    }

    public static Color getGrey(){
        List<Color> greys = new ArrayList<>(Arrays.asList(new Color(220, 220, 220),
                new Color(211, 211, 211), new Color(192, 192, 192), new Color(169, 169, 169),
                new Color(128, 128, 128), new Color(105, 105, 105)));

        Random random = new Random();
        int number = random.nextInt(greys.size());

        return greys.get(number);

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

            this.setBackground(Color.BLACK);
        }
    }

}
