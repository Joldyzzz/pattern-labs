package Creational.AbstractFactory.AbstractFactoryJava.src.walls;

public class BrickWall implements Wall {

    @Override
    public void build() {
        System.out.println("Сложили кирпичные стены");
    }

}
