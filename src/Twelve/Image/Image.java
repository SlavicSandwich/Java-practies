package Twelve.Image;

import javax.swing.*;
import java.awt.*;

class Image extends JFrame {
    int WINDOW_WIDTH = 600;
    int WINDOW_HEIGHT = 600;
    String image_path = "Images/AlEXWO3.png";

    Image() {
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocation(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        java.awt.Image img = Toolkit.getDefaultToolkit().getImage(this.image_path);
        g.drawImage(img, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);
    }

    public static void main(String[] args) {
        Image image = new Image();
    }
}