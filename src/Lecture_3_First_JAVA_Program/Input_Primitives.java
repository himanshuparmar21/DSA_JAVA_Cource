package Lecture_3_First_JAVA_Program;

import java.util.Scanner;

public class Input_Primitives {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Entered Number is :" + num);
    }
}
// int num = 10;
// Here, num is identifier and 10 is object/Value


//Scanner sc = new Scanner(System.in);
// sc.nextInt() => Use to Take Integer Value input
// sc.next() => Use to Take World Value Input(in this Method We Enter Line But in Print This Print First World of Line to Print Whole Line Use nextLine())
// sc.nextLine() => USe To Take Line Value Input
// sc.nextFloat() => USe To Take Float Value Input
// sc.nextDouble() => USe To Take Double Value Input
// sc.nextBoolean() => USe To Take Boolean Value Input

// sc.hasNext+Specified Data Type is USe To check Entered Value is Specified Data Type or not (is Specified data type then print true else false)
