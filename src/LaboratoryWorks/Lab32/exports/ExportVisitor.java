package LaboratoryWorks.Lab32.exports;

import LaboratoryWorks.Lab32.graph.Circle;
import LaboratoryWorks.Lab32.graph.Point;

public interface ExportVisitor {
	void exportPoint(Point p);
	void exportCircle(Circle c);

}
