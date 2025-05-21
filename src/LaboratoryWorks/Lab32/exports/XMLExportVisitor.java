package LaboratoryWorks.Lab32.exports;

import LaboratoryWorks.Lab32.graph.Circle;
import LaboratoryWorks.Lab32.graph.Point;

// методы Visitor'а можно назвать одинаково,
// но с разными типами параметров для разных объектов
// при наличии перегрузки языке
public class XMLExportVisitor implements ExportVisitor {

    @Override
    public void exportPoint(Point p) {
        System.out.printf("<Point x=\"%d\" y=\"%d\" color=\"%s\" />",
                p.getX(), p.getY(), p.getColor());
    }

    @Override
    public void exportCircle(Circle c) {
        System.out.printf("<Circle cx=\"%d\" cy=\"%d\" radius=\"%d\" color=\"%s\" />",
                c.getX(), c.getY(), c.getR(), c.getColor());
    }

}
