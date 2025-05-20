package LaboratoryWorks.Lab2;

public class Line extends GraphObject {
    private int aX, aY, bX, bY;
    private String color;

    public Line(int aX, int aY, int bX, int bY, String color) {
        this.aX = aX;
        this.aY = aY;
        this.bX = bX;
        this.bY = bY;
        this.color = color;
    }

    public int getAX() {
        return aX;
    }

    public int getAY() {
        return aY;
    }

    public int getBX() {
        return bX;
    }

    public int getBY() {
        return bY;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.printf("Line - A(%d, %d), B(%d, %d), %s\n", getAX(), getAY(), getBX(), getBY(), getColor());
    }
}
