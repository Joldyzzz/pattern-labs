package LaboratoryWorks.Lab1;

public class Circle extends GraphObject {
    private int x, y, r;
    private String color;

    public Circle(int x, int y, int r, String color) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getR() {
        return r;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.printf("Circle - A(%d, %d), R:%d, %s\n", getX(), getY(), getR(), getColor());
    }
}
