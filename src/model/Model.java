package model;

import controller.action.Command;

public class Model {
    private double result;

    public void calculate(Command command, double a, double b) {
        result = command.execute(a, b);
    }

    public double getResult() {
        return result;
    }
}
