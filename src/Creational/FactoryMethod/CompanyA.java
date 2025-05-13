package Creational.FactoryMethod;

import Creational.FactoryMethod.windows.PlasticFrameWindow;
import Creational.FactoryMethod.windows.Window;

public class CompanyA extends Supplier {
    @Override
    public Window createWindow() {
        return new PlasticFrameWindow();
    }
}
