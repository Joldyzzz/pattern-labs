package LaboratoryWorks.Lab2;

import java.util.HashMap;
import java.util.Map;

public class Triangle {

    Map<String, Integer> pointA = new HashMap<>();
    Map<String, Integer> pointB = new HashMap<>();
    Map<String, Integer> pointC = new HashMap<>();

    public Triangle() {
        setPointA();
        setPointB();
        setPointC();
    }

    public void setPointA() {
        pointA.put("x", 0);
        pointA.put("y", 0);
    }

    public void setPointB() {
        pointB.put("x", 1);
        pointB.put("y", 1);
    }

    public void setPointC() {
        pointC.put("x", 2);
        pointC.put("y", 0);
    }

}
