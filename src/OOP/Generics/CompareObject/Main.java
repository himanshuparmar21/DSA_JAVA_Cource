package OOP.Generics.CompareObject;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(87.5);
        Student s2 = new Student(98.5);
        Student s3 = new Student(92.5);
        Student s4 = new Student(78.5);
        Student s5 = new Student(99.5);
        Student[] temp = {s1,s2,s3,s4,s5};

        System.out.println(Arrays.toString(temp));
        Arrays.sort(temp, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.mark - o2.mark);
            }
        });
        //Lambda Expression
        Arrays.sort(temp,(o1,o2) -> (int)(o1.mark - o2.mark));


        System.out.println(Arrays.toString(temp));
        System.out.println("Sort int Descending");
        Arrays.sort(temp, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o2.mark - o1.mark);
            }
        });
        // Same as same above code Just using Lambda and - sign
        Arrays.sort(temp,(o1,o2) -> -(int)(o1.mark - o2.mark));
        System.out.println(Arrays.toString(temp));
    }
}
