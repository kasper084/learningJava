package figures;

import java.util.Scanner;

public class Print {

    Scanner numbers = new Scanner(System.in);
    private int height;
    private int width;


    public static void main(String[] args) {
        Print uneven = new Print();
        getPrinted(uneven.getHeight(), uneven.getWidth());

        /*
        Print rectangle = new Print();
        getPrinted(rectangle.getWidth(), rectangle.getHeight());
        */

        /*
        Print piramid = new Print();
        getPrinted(piramid.getHeight(), piramid.getWidth());
        */

        /*
        Print revpiramid = new Print();
        getPrinted(revpiramid.getHeight(), revpiramid.getWidth());
        */
    }

    public int getHeight() {
        System.out.println("Enter uneven number");
        height = numbers.nextInt();
       /* System.out.println("Enter height");
        //height = numbers.nextInt(); rectangle
        height = numbers.nextInt() + 2;*/
        return height;
    }

    public int getWidth() {
              /* piramids
        width = 2 * height - 3;*/

        /* rectangle
        System.out.println("Enter width");
        width = numbers.nextInt();
        */
            return width;

    }

    public static void getPrinted(int height, int width) {

       /* //revpiramid
       for (int row = height - 2; row >= -1; row--) {
            for (int col = 1; col <= width; col++) {
                if (row == -1 || row == height - 2) {
                    System.out.print(" ");
                } else if (col >= height - 1 - row && col <= height - 1 + row) {
                    System.out.print(1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();*/


        /* piramid
        for(int row = - 1; row <= height-2; row++){
            for (int col = 1; col <= width; col++) {
                if (row == - 1 || row == height-2){
                    System.out.print(0);
                }
                else if (col >= height - 1 - row && col <= height - 1 + row ){
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }*/

        /* rectangle
        // top
        for (int line = 1; line <= width; line++) {
            System.out.print("1"); // будь-який знак, при заміні - змінити решту прінтів
        }

        // next line
        System.out.println();

        // midle
        for (int side = 0; side < height - 2; side++) {
            for (int midle = 1; midle <= width; midle++) {
                if (midle != 1 && midle != width) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }

            System.out.println();
        }

        // repeat top
        for (int line = 1; line <= width; line++) {
            System.out.print("1");
        }

        // empty line
        System.out.println();
        }
*/
    }
}