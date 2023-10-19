package fifteen.menu;

import javax.swing.*;
import java.awt.*;

public class menu_selector extends JFrame {
    public menu_selector() {
        setTitle("Two Button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        JPanel menuPanel = new JPanel();
        JComboBox<String> menuComboBox = new JComboBox<>();
        menuComboBox.addItem("Australia");
        menuComboBox.addItem("China");
        menuComboBox.addItem("England");
        menuComboBox.addItem("Russia");
        menuPanel.add(menuComboBox);
        setLayout(new BorderLayout());
        add(menuPanel, BorderLayout.NORTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(menu_selector::new);
    }
}