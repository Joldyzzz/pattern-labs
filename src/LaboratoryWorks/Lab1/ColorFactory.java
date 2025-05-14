package LaboratoryWorks.Lab1;

public class ColorFactory extends BaseFactory {
    public static final String DEFAULT_COLOR = "color";

    @Override
    public Point createPoint() {
        Point point = new Point(1, 2, DEFAULT_COLOR);
        Scene.instance.add(point);

        return point;
    }

    @Override
    public Line createLine() {
        Line line = new Line(0, 0, 1, 1, DEFAULT_COLOR);
        Scene.instance.add(line);

        return line;
    }

    @Override
    public Circle createCircle() {
        Circle circle = new Circle(0, 0, 1, DEFAULT_COLOR);
        Scene.instance.add(circle);

        return circle;
    }

}
