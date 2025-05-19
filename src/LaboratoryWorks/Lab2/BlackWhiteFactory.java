package LaboratoryWorks.Lab2;

public class BlackWhiteFactory extends BaseFactory {
    public static final String DEFAULT_COLOR = "black and white";

    @Override
    public Point createPoint() {
        Point point = new Point(0, 3, DEFAULT_COLOR);
        Scene.instance.add(point);

        return point;
    }

    @Override
    public Line createLine() {
        Line line = new Line(1, 2, 2, 3, DEFAULT_COLOR);
        Scene.instance.add(line);

        return line;
    }

    @Override
    public Circle createCircle() {
        Circle circle = new Circle(1, 0, 2, DEFAULT_COLOR);
        Scene.instance.add(circle);

        return circle;
    }

    @Override
    public TriangleAdapter createTriangle() {
        TriangleAdapter triangle = new TriangleAdapter(new Triangle(), DEFAULT_COLOR);
        Scene.instance.add(triangle);

        return triangle;
    }

}
