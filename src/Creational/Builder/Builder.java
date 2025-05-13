package Creational.Builder;

public interface Builder {

    void reset();

    void prepare();

    void mainWork();

    void addServiceLines();

    void finish();

}
