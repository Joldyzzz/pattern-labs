package Creational.Builder.BuilderJava.src;

public interface Builder {

    void reset();

    void prepare();

    void mainWork();

    void addServiceLines();

    void finish();

}
