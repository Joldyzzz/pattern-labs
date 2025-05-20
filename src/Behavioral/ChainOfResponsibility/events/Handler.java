package Behavioral.ChainOfResponsibility.events;

public interface Handler {

    void setNextHandler(Handler next);

    void handle(EventRequest request);
}
