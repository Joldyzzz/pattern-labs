package Creational.AbstractFactory.AbstractFactoryJava.src;

import java.util.Locale;

import Creational.AbstractFactory.AbstractFactoryJava.src.factories.*;

public class Program {

	public static void main(String[] args) {
		HouseFactory factory;
		if ( Locale.getDefault().getCountry().equals("RU"))
			factory = new StoneHouseFactory();
		else
			factory = new WoodHouseFactory();
		
		factory.createWall().build();
		factory.createRoof().cover().waterProtect();
		factory.createWindow().install().open();

	}

}
