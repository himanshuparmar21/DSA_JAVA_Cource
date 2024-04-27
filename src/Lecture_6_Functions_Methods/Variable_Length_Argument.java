package Lecture_6_Functions_Methods;

import java.util.Arrays;

public class Variable_Length_Argument {
    public static void main(String[] args) {
        Demo(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        Demo();//Work
        /* Demo(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}); */
    }
    static void Demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
}

//This Called "varargs"
//Syntax
/*
function_name(Data_Type ...Argument_name)
 */