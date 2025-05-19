package LaboratoryWorks.Lab2;

public class Circle implements GraphObject {
    private int aX, aY, r;
    private String color;

    public Circle(int aX, int aY, int r, String color) {
        this.aX = aX;
        this.aY = aY;
        this.r = r;
        this.color = color;
    }

    public int getAX() {
        return aX;
    }

    public int getAY() {
        return aY;
    }

    public int getR() {
        return r;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.printf("Circle - A(%d, %d), R:%d, %s\n", getAX(), getAY(), getR(), getColor());
    }
}
