package src.edu.source.it.lectures.lecture2.homework;


/**
 * Created by VVLM on 10.03.2017.
 */
public class TriangleSquare {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1;
        int x2 = 10, y2 = 7;
        int x3 = -3, y3 = 4;



        int xy1 = x1 - y1;
        int xy2 = x2 - y2;
        int xy3 = y3 - x3;

        double length = xy1 +xy2 +xy3;

        int p = (xy1 +xy2 + xy3) / 2;
        double square = Math.sqrt(p*(p - xy1)*(p - xy2)*(p - xy3));

            System.out.println("Length of all sides is " + length);
            System.out.println("Square is " + square);


    }
}
