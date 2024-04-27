package Lecture_6_Functions_Methods;

import java.util.Scanner;

public class Armstrong_Function {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Number:");
//        int num = sc.nextInt();
//        System.out.println(arm(num));

        //All Three Digit Armstrong Number

        for(int i=100;i<=999;i++){
            if(arm(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean arm(int num){
        int ori = num;
        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            sum += (rem * rem * rem);
            num /=10;
        }
        return ori==sum;
    }
}
