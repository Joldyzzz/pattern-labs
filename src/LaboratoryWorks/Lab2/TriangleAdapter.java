package LaboratoryWorks.Lab2;

public class TriangleAdapter implements GraphObject {
    private Triangle triangle;
    private String color;

    public TriangleAdapter(Triangle triangle, String color) {
        this.triangle = triangle;
        this.color = color;
    }

    public int getAX() {
        return triangle.pointA.get("x");
    }

    public int getAY() {
        return triangle.pointA.get("y");
    }

    public int getBX() {
        return triangle.pointB.get("x");
    }

    public int getBY() {
        return triangle.pointB.get("y");
    }

    public int getCX() {
        return triangle.pointC.get("x");
    }

    public int getCY() {
        return triangle.pointC.get("y");
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.printf("Triangle - A(%d, %d), B(%d, %d), C(%d, %d), %s\n", getAX(), getAY(), getBX(), getBY(), getCX(), getCY(), getColor());
    }
}
