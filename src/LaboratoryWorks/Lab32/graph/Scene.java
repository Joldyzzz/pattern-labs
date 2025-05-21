package LaboratoryWorks.Lab32.graph;

import LaboratoryWorks.Lab32.exports.ExportVisitor;
import LaboratoryWorks.Lab32.exports.Exportable;
import LaboratoryWorks.Lab32.exports.JSONExportVisitor;
import LaboratoryWorks.Lab32.exports.XMLExportVisitor;

import java.util.ArrayList;
import java.util.Iterator;
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

    public void clear() {
        objects.clear();
    }

    public void draw() {
        for (GraphObject g : objects)
            g.draw();
    }

    public void exportToJSON() {
        ExportVisitor visitor = new JSONExportVisitor();
        Iterator<GraphObject> iter = objects.iterator();
        System.out.print('[');
        System.out.print("\n");

        while (iter.hasNext()) {
            GraphObject g = iter.next();
            if (g instanceof Exportable) {
                ((Exportable) g).accept(visitor);
                if (iter.hasNext()) System.out.println(',');
            }
        }

        System.out.print("\n");
        System.out.println(']');
    }

    public void exportToXML() {
        ExportVisitor visitor = new XMLExportVisitor();
        Iterator<GraphObject> iter = objects.iterator();
        System.out.print("<XML>");
        System.out.print("\n");

        while (iter.hasNext()) {
            GraphObject g = iter.next();
            if (g instanceof Exportable) {
                ((Exportable) g).accept(visitor);
                if (iter.hasNext()) System.out.println(',');
            }
        }

        System.out.print("\n");
        System.out.println("</XML>");
    }


}
