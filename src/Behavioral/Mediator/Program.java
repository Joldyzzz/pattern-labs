package Behavioral.Mediator;

import Behavioral.Mediator.controllers.WinController;

import static Behavioral.Mediator.tests.User.verifyButton;

public class Program {

    public static void main(String[] args) {

        new WinController().generateWindow().draw();

        verifyButton.press(); // иммитация нажатия

    }

}
