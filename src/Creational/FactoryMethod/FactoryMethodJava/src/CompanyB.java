package Creational.FactoryMethod.FactoryMethodJava.src;

import Creational.FactoryMethod.FactoryMethodJava.src.windows.Window;
import Creational.FactoryMethod.FactoryMethodJava.src.windows.WoodFrameWindow;

public class CompanyB extends Supplier {
    @Override
    public Window createWindow() {
        return new WoodFrameWindow();
    }

}
