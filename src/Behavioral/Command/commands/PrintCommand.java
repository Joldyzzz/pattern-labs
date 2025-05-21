package Behavioral.Command.commands;

import Behavioral.Command.iterator.ContentControlIterator;
import Behavioral.Command.logic.PrintSpooler;
import Behavioral.Command.widgets.CompositeControl;

// команда с параметрами
public class PrintCommand extends Command {

    private final String printer;
    private CompositeControl source;


    public PrintCommand(String printer, CompositeControl source) {
        super();
        this.printer = printer;
        this.source = source;
    }


    @Override
    public void execute() {
        ContentControlIterator iter = source.getContentIterator();
        while (iter.hasMore())
            PrintSpooler.instance.print(printer, iter.getNext().getText());

    }

}
