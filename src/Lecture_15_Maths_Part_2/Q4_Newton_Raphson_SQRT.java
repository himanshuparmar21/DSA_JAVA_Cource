package Lecture_15_Maths_Part_2;

import java.util.Scanner;

public class Q4_Newton_Raphson_SQRT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();

        System.out.println(sqrt(n));
    }
    static double sqrt(double n){
        double x = n;
        double root ;

        while (true){
            root = 0.5 * (x + (n/x));

            if(Math.abs(root-x) < 0.2){
                break;
            }
            x = root;
        }
        return root;
    }
}
