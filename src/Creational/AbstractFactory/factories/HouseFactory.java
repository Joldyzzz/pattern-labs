package Creational.AbstractFactory.factories;

import Creational.AbstractFactory.roofs.Roof;
import Creational.AbstractFactory.walls.Wall;
import Creational.AbstractFactory.windows.Window;

public interface HouseFactory {
    Wall createWall();

    Roof createRoof();

    Window createWindow();
}
