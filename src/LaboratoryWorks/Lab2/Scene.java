package LaboratoryWorks.Lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Scene implements SceneFasade {

    private List<GraphObject> objects;
    public static final Scene instance = new Scene();

    private Scene() {
        objects = new ArrayList<GraphObject>();
    }

    public void add(GraphObject o) {
        objects.add(o);
    }

    public void draw() {
        for (GraphObject g : objects)
            g.draw();
    }

    @Override
    public void showScene(String... args) {
        for (String s : args) {
            try (Scanner sc = new Scanner(s)) {
                if (sc.hasNext("point")) {
                    sc.next("point");
                    add(new Point(sc.nextInt(), sc.nextInt(), sc.nextLine()));
                }
                if (sc.hasNext("line")) {
                    sc.next("line");
                    add(new Line(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextLine()));
                }
                if (sc.hasNext("circle")) {
                    sc.next("circle");
                    add(new Circle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextLine()));
                }
            }
        }

        draw();
    }
}
