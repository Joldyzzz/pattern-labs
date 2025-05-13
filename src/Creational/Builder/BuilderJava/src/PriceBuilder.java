package Creational.Builder.BuilderJava.src;

public class PriceBuilder implements Builder {

    private int total;

    @Override
    public void reset() {
        total = 0;
    }

    @Override
    public void prepare() {
        total += 500;
    }

    @Override
    public void mainWork() {
        total += 1500;
    }

    @Override
    public void addServiceLines() {
        total += 300;
    }

    @Override
    public void finish() {
        total += 400;
    }

    public int getResult() {
        return total;
    }

}
