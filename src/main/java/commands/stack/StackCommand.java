package commands.stack;

import Stack.Stackable;
import cli.Console;
import commands.ICommand;

public abstract class StackCommand<T> implements ICommand {
    protected final transient Stackable<T> stack;
    private final transient String commandName;


    public StackCommand(Stackable<T> stack, String commandName) {
        this.stack = stack;
        this.commandName = commandName;
    }

    @Override
    public String toString() {
        return commandName;
    }
}
