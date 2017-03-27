package src.edu.source.it.lectures.lecture3.homework;

/**
 * Created by VVLM on 15.03.2017.
 */
public class MatrixPrinter {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {7, 5, 4, 1}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();

        }
    }
}
