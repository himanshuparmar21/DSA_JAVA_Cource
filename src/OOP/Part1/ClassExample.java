package OOP.Part1;

public class ClassExample {
    public static void main(String[] args) {
        Student1 s = new Student1();
        s.name = "student1";
        Student1 s1 = new Student1();
        s1.name = "student2";
        System.out.println(s.toString());
        s.Name();
        s1.Name();
    }
}

class Student1{
    int roll ;
    String name;
    void Name(){
        System.out.println(name);
    }
}