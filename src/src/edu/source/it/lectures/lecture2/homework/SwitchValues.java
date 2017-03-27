package src.edu.source.it.lectures.lecture2.homework;

/**
 * Created by VVLM on 10.03.2017.
 */
public class SwitchValues {
    public static void main(String[] args) {
        int first = 5;
        int second = 10;

        first = first + second;
        second = second - first;
        second = - second;
        first = first - second;

        System.out.println("First = " + first + " ,second = " + second);
    }
}
