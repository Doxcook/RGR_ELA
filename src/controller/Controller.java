package controller;
import controller.action.*;
import model.Model;
import view.*;
import javax.swing.*;

public class Controller {
    private final Model model;
    private final Frame frame;

    public Controller(Model model, Frame frame) {
        this.model = model;
        this.frame = frame;
        button();
    }

    private void button() {
        Panel panel = frame.getPanel(); //создаем панельку

        //добавляем слушателя на кнопку
        panel.getCalculateButton().addActionListener(e -> {
            try {
                double a = Double.parseDouble(panel.getInput1()); //получаем первое число
                double b = Double.parseDouble(panel.getInput2()); //получаем второе число
                String operation = panel.getSelectedOperation(); //получаем выбранную операцию

                Command command = CommandFactory.createCommand(operation); //создаем операцию

                //исключение
                if (command == null) {
                    throw new IllegalArgumentException("Invalid operation");
                }

                //вычислить
                model.calculate(command, a, b);
                //установить в панель результат
                panel.setResult(String.valueOf(model.getResult()));

                //окошки для исключений
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Неправильный формат!", "Ошибка", JOptionPane.ERROR_MESSAGE);
            } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(frame, ex.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
