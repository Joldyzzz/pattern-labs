package LaboratoryWorks.Lab2;

public class Point implements GraphObject {
    private int aX, aY;
    private String color;

    public Point(int aX, int aY, String color) {
        this.aX = aX;
        this.aY = aY;
        this.color = color;
    }

    public int getAX() {
        return aX;
    }

    public int getAY() {
        return aY;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.printf("Point - A(%d, %d), %s\n", getAX(), getAY(), getColor());
    }
}
