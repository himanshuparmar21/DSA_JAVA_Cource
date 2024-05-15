package Recursion.Part2;

import java.util.Scanner;

public class Q9_Count_Zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N:");
        int n = sc.nextInt();

        System.out.println(zeroC(n,0));
    }
    static int zeroC(int n,int count){
        if(n == 0){
            return count;
        }
        if((n % 10) == 0){
            return zeroC(n/10,count+1);
        }
        return zeroC(n/10,count);
    }
}
