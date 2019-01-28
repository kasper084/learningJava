package figures;

public class Circle extends FigureList {
    double weight = 3.2;
    double height = 4.1;

    public double getArea() {
        double radius = weight;
        double area = Math.PI * radius * radius;
        return area;
    }

}
