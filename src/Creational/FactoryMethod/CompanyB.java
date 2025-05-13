package Creational.FactoryMethod;

import Creational.FactoryMethod.windows.Window;
import Creational.FactoryMethod.windows.WoodFrameWindow;

public class CompanyB extends Supplier {
    @Override
    public Window createWindow() {
        return new WoodFrameWindow();
    }

}
