package LaboratoryWorks.Lab1;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    private List<GraphObject> objects;
    public static final Scene instance = new Scene();

    private Scene() {
        objects = new ArrayList<GraphObject>();
    }

    public void add(GraphObject o) {
        objects.add(o);
    }

}
