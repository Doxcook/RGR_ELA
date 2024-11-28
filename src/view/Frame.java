package view;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    private final Panel panel;

    public Frame() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        panel = new Panel();
        add(panel, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public Panel getPanel() {
        return panel;
    }
}
