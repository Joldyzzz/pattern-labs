package LaboratoryWorks.Lab31.events;

public interface Handler {

    void setNextHandler(Handler next);

    void handle(EventRequest request);
}
