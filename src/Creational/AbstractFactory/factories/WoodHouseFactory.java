package Creational.AbstractFactory.factories;

import Creational.AbstractFactory.roofs.Roof;
import Creational.AbstractFactory.roofs.WoodRoof;
import Creational.AbstractFactory.walls.Wall;
import Creational.AbstractFactory.walls.WoodWall;
import Creational.AbstractFactory.windows.Window;
import Creational.AbstractFactory.windows.WoodFrameWindow;

public class WoodHouseFactory implements HouseFactory {

    @Override
    public Wall createWall() {
        return new WoodWall();
    }

    @Override
    public Roof createRoof() {
        return new WoodRoof();
    }

    @Override
    public Window createWindow() {
        return new WoodFrameWindow();
    }

}
