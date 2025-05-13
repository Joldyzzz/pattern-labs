package Creational.Prototype;

public class ColorPoint extends Point implements Prototype {
    StringBuilder color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = new StringBuilder(color);
    }

    public ColorPoint(int x, int y, StringBuilder color) {
        super(x, y);
        this.color = color;
    }

    public ColorPoint(ColorPoint p) {
        this(p.x, p.y, new StringBuilder(p.color)); // deep clone
    }

    @Override
    public ColorPoint Clone() {
        return new ColorPoint(this);
    }

    @Override
    public String toString() {
        return String.format("Color Point (%d,%d) %s", x, y, color);
    }

}
