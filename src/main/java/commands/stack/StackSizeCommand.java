package commands.stack;

import Stack.Stackable;
import cli.Console;
import data.Student;

public class StackSizeCommand extends StackCommand<Student> {

    private final static String sCommandName = "Get size of stack.";

    public StackSizeCommand(Stackable<Student> stack) {
        super(stack, sCommandName);
    }

    @Override
    public void execute() {
        int size = stack.size();
        System.out.println("Stack size: " + size);
    }
}
