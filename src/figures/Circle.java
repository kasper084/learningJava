package figures;

public class Circle extends Figures{

    public double getArea() {
        double radius = width + height;
        double area = Math.PI * radius * radius;
        return area;
    }

}
