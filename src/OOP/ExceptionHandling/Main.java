package OOP.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
//        int a = 10 / 0;

        try{
            System.out.println(divide());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("always Run");
        }
    }
    static int divide() throws Exception{
        int b = 0;
        if(b == 0){
            throw new ArithmeticException("Not divide by zero");
        }
        return 10/b;
    }
}
