package figures;

public class Triangle extends FigureList {
    double weight = 3.2;
    double height = 4.1;

    public double getArea() {
        double area = (height * weight)/2;
        return area;
    }

}