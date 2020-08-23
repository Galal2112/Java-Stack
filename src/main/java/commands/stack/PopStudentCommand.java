package commands.stack;

import Stack.Stackable;
import cli.Console;
import data.Student;

public class PopStudentCommand extends StackCommand<Student> {

    private final static String sCommandName = "Pop student from stack.";

    public PopStudentCommand(Stackable<Student> stack) {
        super(stack, sCommandName);
    }

    @Override
    public void execute() {
        Student s = stack.pop();
        if (s == null) {
            System.out.println("Empty Stack");
            return;
        }
        System.out.println(s);
    }
}
