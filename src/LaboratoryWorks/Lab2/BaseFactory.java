package LaboratoryWorks.Lab2;

public abstract class BaseFactory {
    public abstract Point createPoint();

    public abstract Line createLine();

    public abstract Circle createCircle();

    public abstract TriangleAdapter createTriangle();
}