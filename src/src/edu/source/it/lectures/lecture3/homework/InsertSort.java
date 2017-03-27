package src.edu.source.it.lectures.lecture3.homework;
import java.util.Arrays;

/**
 * Created by VVLM on 15.03.2017.
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] array = {5, 7, 9, 15, 10, -1, 8};
        int[] array2 = doInsertionSort(array);
        for (int i : array2) {
            System.out.print(i);
            System.out.print(", ");
        }
    }

    public static int[] doInsertionSort(int[] input) {

        int temp;
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j - 1]) {
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }
        return input;
    }
}