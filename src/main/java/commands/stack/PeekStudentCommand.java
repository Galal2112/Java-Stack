package commands.stack;

import Stack.Stackable;
import cli.Console;
import data.Student;

public class PeekStudentCommand extends StackCommand<Student> {

    private final static String sCommandName = "Peek student.";

    public PeekStudentCommand(Stackable<Student> stack) {
        super(stack, sCommandName);
    }

    @Override
    public void execute() {
        Student s = stack.peek();
        if (s == null) {
            System.out.println("Empty Stack");
            return;
        }
        System.out.println(s);
    }
}
