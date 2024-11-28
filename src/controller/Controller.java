package controller;
import controller.action.Command;
import controller.action.Factory;
import model.Model;
import view.Frame;
import view.Panel;

import javax.swing.*;

public class Controller {
    private final Model model;
    private final Frame frame;

    public Controller(Model model, Frame frame) {
        this.model = model;
        this.frame = frame;
    }

    public void init() {
        Panel panel = frame.getPanel();
        panel.getCalculateButton().addActionListener(e -> {
            try {
                double a = Double.parseDouble(panel.getInput1());
                double b = Double.parseDouble(panel.getInput2());
                String operation = panel.getSelectedOperation();

                Command command = Factory.getCommand(operation);
                if (command == null) {
                    throw new IllegalArgumentException("Invalid operation");
                }

                model.calculate(command, a, b);
                panel.setResult(String.valueOf(model.getResult()));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid number format!", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
