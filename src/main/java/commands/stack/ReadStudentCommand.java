package commands.stack;

import Stack.Stackable;
import cli.Console;
import data.Student;

public abstract class ReadStudentCommand extends StackCommand<Student> {

    protected final transient Console console;

    public ReadStudentCommand(Console console, Stackable<Student> stack, String commandName) {
        super(stack, commandName);
        this.console = console;
    }

    public Student readStudentFromStd() {
        String prename = console.readStringFromStdin("Please enter prename:");
        String surname = console.readStringFromStdin("Please enter surname:");
        int courseNumber = console.readIntegerFromStdin("Please enter course number:");
        int marticulationNumber = console.readIntegerFromStdin("Please enter matriculation number:");
        return new Student(prename, surname, courseNumber, marticulationNumber);
    }
}
