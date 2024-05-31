package OOP.Part1;

public class ClassExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "student1";
        Student s1 = new Student();
        s1.name = "student2";
        System.out.println(s.toString());
        s.Name();
        s1.Name();
    }
}

class Student{
    int roll ;
    String name;
    void Name(){
        System.out.println(name);
    }
}