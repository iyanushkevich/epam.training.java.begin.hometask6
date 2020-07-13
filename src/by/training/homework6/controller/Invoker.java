package by.training.homework6.controller;

import by.training.homework6.controller.command.Command;
import by.training.homework6.exception.UserException;

import java.util.Map;

public final class Invoker {
    private static Invoker instance;

    private Invoker() {

    }

    public static Invoker createInstance() {
        if (instance == null) {
            instance = new Invoker();
        }
        return instance;
    }

    public Map processRequest(String currentCommand, Map<String, String> data)
            throws UserException {
        CommandProvider provider = new CommandProvider();
        Command command = provider.provideCommand(currentCommand);
        return command.execute(data);
    }
}
