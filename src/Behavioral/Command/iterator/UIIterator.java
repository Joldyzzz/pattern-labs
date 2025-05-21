package Behavioral.Command.iterator;

import Behavioral.Command.widgets.UIComponent;

public interface UIIterator {
    UIComponent getNext();

    boolean hasMore();


}
