package Creational.AbstractFactory.AbstractFactoryJava.src.factories;

import Creational.AbstractFactory.AbstractFactoryJava.src.roofs.Roof;
import Creational.AbstractFactory.AbstractFactoryJava.src.walls.Wall;
import Creational.AbstractFactory.AbstractFactoryJava.src.windows.Window;

public interface HouseFactory {
    Wall createWall();

    Roof createRoof();

    Window createWindow();
}
