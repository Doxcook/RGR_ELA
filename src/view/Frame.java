package view;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    private final Panel panel;

    public Frame() {

        setTitle("Кулькулятор");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        panel = new Panel();
        add(panel, BorderLayout.CENTER);
        setSize(600,150);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public Panel getPanel() {
        return panel;
    }
}
