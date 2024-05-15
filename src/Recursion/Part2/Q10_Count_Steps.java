package Recursion.Part2;

import java.util.Scanner;

public class Q10_Count_Steps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N:");
        int n = sc.nextInt();

        System.out.println(numberOfSteps(n));
    }
    static int numberOfSteps(int num) {
        return count(num,0);
    }
    static int count(int num,int count){
        if(num <= 0){
            return count;
        }
        if(num%2==0){
            return count(num/2,count+1);
        }
        return count(num-1,count+1);
    }
}
