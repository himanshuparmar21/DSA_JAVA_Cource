package Lecture_4_Loop_Condition;

import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        float num1,num2;
        do{
            System.out.print("Enter Choice:\n1.+ \n2.- \n3.* \n4./ \n5.Exit");
            choice = sc.nextInt();
            System.out.print("Enter Two Number:");
            num1 = sc.nextFloat();
            num2 = sc.nextFloat();
            if(choice==1){
                System.out.println("Sum of " + num1 + " And " + num2 + ":" + (num1 + num2));
            } else if (choice==2) {
                System.out.println("Div of " + num1 + " And " + num2 + ":" + (num1 - num2));
            } else if (choice==3) {
                System.out.println("Mul of " + num1 + " And " + num2 + ":" + (num1 * num2));
            } else if (choice==4) {
                System.out.println("Division of " + num1 + " And " + num2 + ":" + (num1 / num2));
            }else{
                System.out.println("Invalid Number Choice");
            }
        }while (choice!=5);
    }
}
