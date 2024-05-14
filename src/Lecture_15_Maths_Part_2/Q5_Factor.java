package Lecture_15_Maths_Part_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Q5_Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        factor(n);
        factor2(n);
        factor3(n);
    }

//    O(n)
    static void factor(int n){
        for (int i = 1; i <= n; i++) {
            if(n%i == 0){
                System.out.print(i + " ");
            }
        }
    }

//    O(sqrt(n))
    static void factor2(int n){
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if(n%i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }else{
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }

//    space and time both O(sqrt(n))
    // Use This Method to Print Ascending Order
    static void factor3(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if(n%i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }else{
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size() - 1; i >= 0 ; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
