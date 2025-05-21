package Behavioral.Command.commands;

public interface CommandInvoker {
    void setCommand(Command command);

    void executeCommand();
}
