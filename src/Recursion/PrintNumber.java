package Recursion;

public class PrintNumber {
    public static void main(String[] args) {
        // WAF that takes in a number and prints it
        //print first 4 number : 1 2 3 4
        print(1);
    }

    static void print(int n){
        if(n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);

        //This is Called tail recursion
        //this is the last function call
        print(n + 1);
    }
}

//In this all Function Name is different but Body is All Function is same (Exactly During Same Thing)