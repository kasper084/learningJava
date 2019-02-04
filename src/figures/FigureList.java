package figures;

import java.util.Arrays;

public abstract class FigureList extends Figures {

    static int kids;

    public static void main(String[] args) {

        Figures[] figureList = {new Circle(), new Square(), new Triangle(), new BigSquare()};

        Arrays.sort(figureList, (figure1, figure2) -> (int) (figure2.getArea() - figure1.getArea()));
        // if (figure1 - figure2) will show figures from smaller to bigger

        for (Figures figures : figureList) {
            System.out.println(figures.getArea());
        }

        for (int count = 0; count < figureList.length; count++){
            if (figureList[count]instanceof Figures){
                kids ++;
            }
        }
        System.out.println("Figures class is parent for " + kids + " classes");
    }
}
