package controller.action;

public class Add implements Command {
    public double execute(double a, double b) {
        return a + b;
    }
}
