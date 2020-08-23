package commands.stack;

import Stack.Stackable;
import cli.Console;
import data.Student;

public class PushStudentCommand extends ReadStudentCommand {

    private final static String sCommandName = "Push student to stack.";

    public PushStudentCommand(Console console, Stackable<Student> stack) {
        super(console, stack, sCommandName);
    }

    @Override
    public void execute() {
        Student s = readStudentFromStd();
        stack.push(s);
    }
}
