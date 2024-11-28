package controller.action;

public class Multiply implements Command {
    public double execute(double a, double b) {
        return a * b;
    }
}
