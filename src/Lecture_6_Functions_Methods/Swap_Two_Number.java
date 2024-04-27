package Lecture_6_Functions_Methods;

public class Swap_Two_Number {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before Swap:a = " + a + " " + " b = " + b);
        swap(a,b);
        System.out.println("After Swap:a = " + a + " " + " b = " + b);
// Not Change Value (Because Pass By value)

        /*
      //Method 1 (with Using Third Variable)
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap:a = " + a + " " + " b = " + b);

        System.out.println("----------------------------------------------------------------------");
      //Method 2 (without Using Third Variable)
        System.out.println("Before Swap:a = " + a + " " + " b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap:a = " + a + " " + " b = " + b);

        System.out.println("----------------------------------------------------------------------");
        //Method 3 (Using XOR(^) Operator)
        System.out.println("Before Swap:a = " + a + " " + " b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swap:a = " + a + " " + " b = " + b);
        */
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
