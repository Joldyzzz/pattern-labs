package LaboratoryWorks.Lab1;

public class Line extends GraphObject {
    private int startX, startY, endX, endY;
    private String color;

    public Line(int startX, int startY, int endX, int endY, String color) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.color = color;
    }

    public int getStartX() {
        return startX;
    }

    public int getStartY() {
        return startY;
    }

    public int getEndX() {
        return endX;
    }

    public int getEndY() {
        return endY;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.printf("Line - A(%d, %d), B(%d, %d), %s\n", getStartX(), getStartY(), getEndX(), getEndY(), getColor());
    }
}
