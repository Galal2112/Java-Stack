package commands.stack;

import Stack.Stackable;
import cli.Console;
import data.Student;

public class PrintStackCommand extends StackCommand<Student> {

    private final static String sCommandName = "Print all students from stack.";

    public PrintStackCommand(Stackable<Student> stack) {
        super(stack, sCommandName);
    }

    @Override
    public void execute() {
        stack.printall();
    }
}
