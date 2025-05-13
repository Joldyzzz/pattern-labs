package Creational.FactoryMethod.FactoryMethodJava.src;

import Creational.FactoryMethod.FactoryMethodJava.src.windows.PlasticFrameWindow;
import Creational.FactoryMethod.FactoryMethodJava.src.windows.Window;

public class CompanyA extends Supplier {
	@Override
	public Window createWindow() {
		return new PlasticFrameWindow();
	}
}
