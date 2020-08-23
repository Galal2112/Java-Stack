/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package app;

import Stack.Stack;
import Stack.Stackable;
import cli.Console;
import commands.CommandFactory;
import commands.CommandInvoker;
import commands.ICommand;
import data.Student;

import java.util.ArrayList;
public class App {

    public static void main(String[] args) {
        Console console = new Console();
        Stackable<Student> stack = new Stack<Student>();
        ArrayList<ICommand> commands = CommandFactory.getStackCommands(console, stack);
        CommandInvoker invoker = new CommandInvoker(commands, console, "Students Stack App", true);
        invoker.run();
    }

}
