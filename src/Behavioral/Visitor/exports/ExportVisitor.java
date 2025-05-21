package Behavioral.Visitor.exports;

import Behavioral.Visitor.graph.Circle;
import Behavioral.Visitor.graph.Point;

public interface ExportVisitor {
	void exportPoint(Point p);
	void exportCircle(Circle c);

}
