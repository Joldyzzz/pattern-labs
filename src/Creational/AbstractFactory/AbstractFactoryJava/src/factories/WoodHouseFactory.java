package Creational.AbstractFactory.AbstractFactoryJava.src.factories;

import Creational.AbstractFactory.AbstractFactoryJava.src.roofs.Roof;
import Creational.AbstractFactory.AbstractFactoryJava.src.roofs.WoodRoof;
import Creational.AbstractFactory.AbstractFactoryJava.src.walls.Wall;
import Creational.AbstractFactory.AbstractFactoryJava.src.walls.WoodWall;
import Creational.AbstractFactory.AbstractFactoryJava.src.windows.Window;
import Creational.AbstractFactory.AbstractFactoryJava.src.windows.WoodFrameWindow;

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
