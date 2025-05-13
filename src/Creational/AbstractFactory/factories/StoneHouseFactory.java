package Creational.AbstractFactory.factories;

import Creational.AbstractFactory.roofs.Roof;
import Creational.AbstractFactory.roofs.TileRoof;
import Creational.AbstractFactory.walls.BrickWall;
import Creational.AbstractFactory.walls.Wall;
import Creational.AbstractFactory.windows.PlasticFrameWindow;
import Creational.AbstractFactory.windows.Window;

public class StoneHouseFactory implements HouseFactory {

    @Override
    public Wall createWall() {
        return new BrickWall();
    }

    @Override
    public Roof createRoof() {
        return new TileRoof();
    }

    @Override
    public Window createWindow() {
        return new PlasticFrameWindow();
    }

}
