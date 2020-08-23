package commands;

import Stack.Stackable;
import cli.Console;
import commands.stack.*;
import data.Student;

import java.util.ArrayList;

public abstract class CommandFactory {

    public static ArrayList<ICommand> getStackCommands(Console console, Stackable<Student> stack) {
        ArrayList<ICommand> commands = new ArrayList<>();
        commands.add(new PushStudentCommand(console, stack));
        commands.add(new PopStudentCommand(stack));
        commands.add(new PeekStudentCommand(stack));
        commands.add(new CheckDataExistCommand(stack));
        commands.add(new ClearStackCommand(stack));
        commands.add(new PrintStackCommand(stack));
        commands.add(new StackSizeCommand(stack));
        return commands;
    }
}
