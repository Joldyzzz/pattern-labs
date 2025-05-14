package LaboratoryWorks.Lab1;

public class Point extends GraphObject {
    private int x, y;
    private String color;

    public Point(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.printf("Point - A(%d, %d), %s\n", getX(), getY(), getColor());
    }
}
