package figures;

public class Triangle extends FigureList {
    double width = 3.2;
    double height = 4.1;

    public double getArea() {
        double area = (height * width)/2;
        return area;
    }

}