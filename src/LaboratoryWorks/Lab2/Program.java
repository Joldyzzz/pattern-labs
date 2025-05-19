package LaboratoryWorks.Lab2;

public class Program {
    public static void main(String[] args) {
        BaseFactory colorFactory = new ColorFactory();

        System.out.println("Результат отрисовки цветной фабрики:");

        colorFactory.createPoint().draw();
        colorFactory.createLine().draw();
        colorFactory.createCircle().draw();
        colorFactory.createTriangle().draw();

        BaseFactory blakWhiteFactory = new BlackWhiteFactory();

        System.out.println();
        System.out.println("Результат отрисовки черно-белой фабрики:");

        blakWhiteFactory.createPoint().draw();
        blakWhiteFactory.createLine().draw();
        blakWhiteFactory.createCircle().draw();
        blakWhiteFactory.createTriangle().draw();

    }
}
