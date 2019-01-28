package figures;

public class Square extends FigureList{
    double weight = 3.2;
    double height = 4.1;
    public double getArea(){
        double area = height * height;
        return area;
    }

}
