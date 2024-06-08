package OOP.Part2.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance("Himanshu");
        System.out.println(obj.name);
        Singleton obj1 = Singleton.getInstance("HI");
        System.out.println(obj1.name);
    }
}
