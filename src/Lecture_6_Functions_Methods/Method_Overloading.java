package Lecture_6_Functions_Methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Method_Overloading {
    public static void main(String[] args) {
        Demo(25); //First Method Call
        Demo("Himanshu"); // Second Method Call
        //Demo(); //Ambiguous Call

        fun(1,2,3,4,5,6);
        fun("Himanshu","Darshan","Hello");

        //fun(); // Ambiguous Call
    }

//    First
    static void Demo(int num){
        System.out.println(num);
    }

    //Second
    static void Demo(String name){
        System.out.println(name);
    }


    //------------------------------------------
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }

}

//Method Overloading Means Two or more function has Same name but parameter are different

//When Call Both Method Then this Call ambiguous method call