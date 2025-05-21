package LaboratoryWorks.Lab31.events;

import java.util.List;
import java.util.ArrayList;

public class Switcher {

    private List<HandleListener> listeners =
            new ArrayList<HandleListener>();

    public void addHandleListener(HandleListener l) {
        listeners.add(l);
    }

    public void switchOn() {
        System.out.println("выключатель включен");

        for (HandleListener l : listeners)
            l.buttonClick(this);

    }
}