package Lecture_6_Functions_Methods;

public class String_Example {
    public static void main(String[] args) {
        System.out.println(temp());
    }

    static String temp(){
        String str = "hello World";
//        return str; This is Also Work
        return "Hello World";
//        return 23; This is Not Work Because Return Type is String(Required String) and We Return int
    }
}
