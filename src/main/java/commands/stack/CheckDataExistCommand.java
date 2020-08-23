package commands.stack;

import Stack.Stackable;
import cli.Console;
import data.Student;

public class CheckDataExistCommand extends StackCommand<Student> {

    private final static String sCommandName = "Check if students are on the stack.";

    public CheckDataExistCommand(Stackable<Student> stack) {
        super(stack, sCommandName);
    }

    @Override
    public void execute() {
        boolean isEmpty = stack.empty();
        if (isEmpty) {
            System.out.println("Empty stack");
        } else {
            System.out.println("Data exist");
        }
    }
}
