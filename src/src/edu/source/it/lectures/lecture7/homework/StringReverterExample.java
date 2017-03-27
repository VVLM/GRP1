package src.edu.source.it.lectures.lecture7.homework;

/**
 * Created by VVLM on 27.03.2017.
 */
public class StringReverterExample {
    public static void main(String[] args) {
        /*Integer a = -128;
        Integer d = -128;
        System.out.println((a == d) + " " + a.equals(d));*/
        String s = "fght";
        String gg = "Hello from the other side";
        System.out.println(StringReverter.revert(s));
        System.out.println(StringReverter.revert(gg));
    }


}

