package Creational.AbstractFactory.AbstractFactoryJava.src.factories;

import Creational.AbstractFactory.AbstractFactoryJava.src.roofs.Roof;
import Creational.AbstractFactory.AbstractFactoryJava.src.roofs.TileRoof;
import Creational.AbstractFactory.AbstractFactoryJava.src.walls.BrickWall;
import Creational.AbstractFactory.AbstractFactoryJava.src.walls.Wall;
import Creational.AbstractFactory.AbstractFactoryJava.src.windows.PlasticFrameWindow;
import Creational.AbstractFactory.AbstractFactoryJava.src.windows.Window;

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
