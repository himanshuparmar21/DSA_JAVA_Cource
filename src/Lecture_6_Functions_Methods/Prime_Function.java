package Lecture_6_Functions_Methods;

import java.util.Scanner;

public class Prime_Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        System.out.println(num + " " + prime(num) + " Prime");
        System.out.println(prime2(num));
    }
    static String prime(int num){
        for(int i=2;i<Math.sqrt(num)+1;i++){
            if(num % i == 0){
                return "is Not";
            }
        }
        return "is";
    }

    static boolean prime2(int num){
        if(num <= 1){
            return false;
        }

        int c = 2;
        while(c * c <= num){
            if(num % c == 0){
                return false;
            }
            c++;
        }
        return c * c > num;
    }
}
