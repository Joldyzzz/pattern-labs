package Behavioral.Memento;

import Behavioral.Memento.graph.AbstractGOFactory;
import Behavioral.Memento.graph.ColorGOFactory;
import Behavioral.Memento.graph.Scene;
import Behavioral.Memento.graph.Scene.SceneSnapshot;

public class Program {

    public static void main(String[] args) {
        AbstractGOFactory gof = new ColorGOFactory();
        gof.createPoint().setColor("red");
        gof.createPoint().setColor("green");

        System.out.println("Original scene");
        Scene.instance.draw();

        SceneSnapshot s1 = Scene.instance.save();
        // нет доступа к данным snapshot'а !!!

        System.out.println("Black scene");
        Scene.instance.setColor("black");
        Scene.instance.draw();

        System.out.println("Restored scene");
        Scene.instance.restore(s1);
        Scene.instance.draw();

        System.out.println("Black scene");
        Scene.instance.setColor("black");
        Scene.instance.draw();

        System.out.println("Restored scene");
        Scene.instance.restore(s1);
        Scene.instance.draw();
    }

}
