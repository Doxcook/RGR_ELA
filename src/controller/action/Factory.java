package controller.action;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private static final Map<String, Command> commands = new HashMap<>();

    static {
        commands.put("+", new Add());
        commands.put("-", new Subtract());
        commands.put("*", new Multiply());
        commands.put("/", new Divide());
    }

    public static Command getCommand(String op) {
        return commands.get(op);
    }
}
