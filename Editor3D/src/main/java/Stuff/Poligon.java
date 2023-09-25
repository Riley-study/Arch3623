package Stuff;

import java.util.ArrayList;
import java.util.List;

public class Poligon {
    public List<Point3D> points = new ArrayList<Point3D>();
    // конструктор
    public Poligon(Point3D point){
        // добавили однин элемент (первоначальную точку)
        points.add(point);
    }
}
