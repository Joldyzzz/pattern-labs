package Structural.Bridge.ui;

import Structural.Bridge.platforms.Database;

public class AdminInterface extends UserInterface {

    public AdminInterface(Database db) {
        super(db);
    }

    @Override
    public String getRole() {
        return "Administrator";
    }

}
