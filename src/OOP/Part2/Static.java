package OOP.Part2;

public class Static {
    public static void main(String[] args) {
//        Human h1 = new Human(22);
//        Human h2 = new Human(20);
//        System.out.println(Human.population);
//        System.out.println(Human.population);
        Static s = new Static();
        s.Demo();
    }

    void Demo() {
        Hel();
    }
    void Hel(){
        System.out.println("HEl");
    }
}

class Human {
    static int population;
    int age;

    private Human(int i) {
        this.age = i;
        Human.population += 1;
    }
}
