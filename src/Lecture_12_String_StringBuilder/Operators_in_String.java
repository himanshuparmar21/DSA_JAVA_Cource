package Lecture_12_String_StringBuilder;

import java.util.ArrayList;

public class Operators_in_String {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); //195 (char + char => ASCII Value(Integer value)
        System.out.println("a" + "b"); //ab (String + String => Join String and return )
        System.out.println('a' + 3); //100 (Char + integer => (Integer Value) ASCII

        System.out.println((char) ('a' + 3)); //d
        System.out.println("a" + 1); //a1
//        When Concatenation String and int then int Convert TO Wrapper class and Join Both and return
        System.out.println("Hello" + new ArrayList<>()); //Hello[]
//        System.out.println("Hello" + new Integer(50)); //Hello50
//        System.out.println(new Integer(50) + new ArrayList<>());
//        String ab = new Integer(50) + "" + new ArrayList<>();
//        System.out.println(ab); // 50[]
    }
}

// + only use with primitive
// and in object only work with one is primitive