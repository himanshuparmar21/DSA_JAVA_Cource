package Lecture_6_Functions_Methods;

public class Scope {
    public static void main(String[] args) {
        int a = 10;

        System.out.println(a); // Can Access a
        //System.out.println(num); //cannot Access num variable from Demo function And Also Can Not Access Mark
    }
    static void Demo(int mark){
        int num = 10;
        System.out.println(num); //Can access num
        System.out.println(mark); //can access mark
        //System.out.println(a); //cannot access a from main method
    }
}
