package Lecture_12_String_StringBuilder;

import java.util.Arrays;

public class StringBuilder_Methods {
    public static void main(String[] args) {
        String sb = "Himanshu Parmar";
        System.out.println(Arrays.toString(sb.toCharArray()));
        System.out.println(sb.toLowerCase());
        System.out.println(sb.charAt(2));
        System.out.println(sb.strip());
        System.out.println(sb.indexOf("Par"));
        System.out.println(Arrays.toString(sb.split("a")));
    }
}
