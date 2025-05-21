package Behavioral.Mediator.controllers;

import Behavioral.Mediator.widgets.UIComponent;

public interface Mediator {
    void notify(UIComponent sender, String event);

}
