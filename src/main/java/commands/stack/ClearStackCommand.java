package commands.stack;

import Stack.Stackable;
import cli.Console;
import data.Student;

public class ClearStackCommand extends StackCommand<Student> {

    private final static String sCommandName = "Clear stack.";

    public ClearStackCommand(Stackable<Student> stack) {
        super(stack, sCommandName);
    }

    @Override
    public void execute() {
        stack.clear();
        System.out.println("Stack cleared");
    }
}
