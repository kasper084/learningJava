package figures;

import pattern.FigureList;

public class Circle extends FigureList {
    double width = 3.2;
    double height = 4.1;

    public double getArea() {
        double radius = width + height;
        double area = Math.PI * radius * radius;
        return area;
    }

}
