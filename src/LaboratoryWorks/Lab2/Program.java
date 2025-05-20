package LaboratoryWorks.Lab2;

public class Program {
    public static void main(String[] args) {
        BaseFactory colorFactory = new ColorFactory();

        colorFactory.createPoint();
        colorFactory.createLine();
        colorFactory.createCircle();
        colorFactory.createTriangle();

        BaseFactory blakWhiteFactory = new BlackWhiteFactory();

        blakWhiteFactory.createPoint();
        blakWhiteFactory.createLine();
        blakWhiteFactory.createCircle();
        blakWhiteFactory.createTriangle();

        Scene.instance.showScene("point 10 20 red", "line 10 20 30 40 red", "circle 2 3 4 red");

    }
}
