package Recursion;

public class Massage {
    public static void main(String[] args) {
        //WAF TO Print Hello World
        massage();
    }
    static void massage(){
        System.out.println("Hello World");
        massage1();
    }
    static void massage1(){
        System.out.println("Hello World");
        massage2();
    }
    static void massage2(){
        System.out.println("Hello World");
        massage3();
    }
    static void massage3(){
        System.out.println("Hello World");
    }
}


//In This Problem First Main Fun. Run and That Called Massage And Massage Function print ANd Then That Called Massage1 called nad That Function called massage2 and so on..