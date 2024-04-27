package Lecture_6_Functions_Methods;

public class Shadowing {
    static int a = 25; //This is a Shadowed at line 8
    public static void main(String[] args) {
        System.out.println(a); //25
        int a ;
        //System.out.println(a); //Scope will begin when value is initialize
        a = 40;
        System.out.println(a); //40
        Demo();
    }
    static void Demo(){
        System.out.println(a);
    }
}
