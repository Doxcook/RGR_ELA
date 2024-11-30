package view;
import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    private final JTextField input1; //поле первого числа
    private final JTextField input2; //поле второго числа
    private final JTextField result; // поле с результатом
    private final JComboBox<String> operations; //поле для выбора операции
    private final JButton calculate; // кнопка

    public Panel() {
        setLayout(new GridLayout(2, 1));

        JPanel inputPanel = new JPanel();

        input1 = new JTextField(10);
        input2 = new JTextField(10);

        //меню операций
        operations = new JComboBox<>(new String[]{"+", "-", "*", "/"});
        calculate = new JButton("=");


        inputPanel.add(new JLabel("Число 1:"));
        inputPanel.add(input1);
        inputPanel.add(new JLabel("Операция:"));
        inputPanel.add(operations);
        inputPanel.add(new JLabel("Число 2:"));
        inputPanel.add(input2);
        inputPanel.add(calculate);

        JPanel resultPanel = new JPanel();
        result = new JTextField(15);
        result.setEditable(false);
        resultPanel.add(new JLabel("Результат:"));
        resultPanel.add(result);

        add(inputPanel);
        add(resultPanel);
    }

    public String getInput1() {
        return input1.getText();
    }

    public String getInput2() {
        return input2.getText();
    }

    public String getSelectedOperation() {
        return (String) operations.getSelectedItem();
    }

    public void setResult(String resultText) {
        result.setText(resultText);
    }

    public JButton getCalculateButton() {
        return calculate;
    }
}
