package controller.action;

public class CommandFactory {
    public static Command createCommand(String operation) {
        return switch (operation) {
            case "+" -> new Add();
            case "-" -> new Subtract();
            case "*" -> new Multiply();
            case "/" -> new Divide();
            default -> null;
        };
    }
}

