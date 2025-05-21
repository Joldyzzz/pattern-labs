package Behavioral.Visitor;

import Behavioral.Visitor.graph.AbstractGOFactory;
import Behavioral.Visitor.graph.ColorGOFactory;
import Behavioral.Visitor.graph.Scene;

public class Program {

    public static void main(String[] args) {
        AbstractGOFactory gof = new ColorGOFactory();
        gof.createPoint().setColor("red");
        gof.createPoint().setColor("green");

        gof.createCircle().setColor("blue");

        Scene.instance.draw();
        Scene.instance.exportToJSON();

    }

}
