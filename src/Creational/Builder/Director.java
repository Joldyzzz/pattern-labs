package Creational.Builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void make(boolean withServiceLine) {
        builder.reset();
        builder.prepare();
        builder.mainWork();
        if (withServiceLine)
            builder.addServiceLines();
        builder.finish();
    }

}
