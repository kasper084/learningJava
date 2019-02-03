package pattern;

import figures.*;

import java.util.Arrays;

public abstract class FigureList implements Area {

    public static void main(String[] args) {
        FigureList[] figureList = {new Circle(), new Square(), new Triangle(), new BigSquare()};

        Arrays.sort(figureList,(figure1, figure2) -> (int)(figure2.getArea() - figure1.getArea()));
        // figure1 - figure2 буде показувати від меншого до більшого

        for (FigureList figure : figureList) {
            System.out.println(figure.getArea());
        }

    }

}


