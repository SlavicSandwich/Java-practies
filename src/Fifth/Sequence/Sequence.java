package Fifth.Sequence;

import java.awt.*;
import javax.swing.*;
import java.io.File;

class Sequence extends JFrame {
    int WINDOW_WIDTH = 600;
    int WINDOW_HEIGHT = 600;
    String images_path = "Images/";


    // Init
    Sequence() {
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocation(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Paint method
    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        File dir = new File(this.images_path);
        for (File file : dir.listFiles()) {
            Image frame = Toolkit.getDefaultToolkit().getImage(file.getPath());
            g.drawImage(frame, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence();
    }
}