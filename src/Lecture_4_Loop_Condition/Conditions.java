package Lecture_4_Loop_Condition;

public class Conditions {
    public static void main(String[] args){
        int a = 10;
        if(a > 10){
            System.out.println("a is Larger Than 10");
        } else {
            System.out.println("a is Smaller Than 10");
        }

//        Multiple if else-if
        if(a > 10){
            System.out.println("a is Larger Than 10");
        } else if(a<10) {
            System.out.println("a is Smaller Than 10");
        } else{
            System.out.println("a is 10");
        }
    }
}
// Syntax Of if Conditions
// if(Expression T or F){ //body }