package OOP.Part1;

import java.util.Arrays;

public class ClassArray {
    public static void main(String[] args) {
        // Initialize the array of Student objects
        Student[] s = new Student[3];
        for (int i = 0; i < s.length; i++) {
            s[i] = new Student();  // Initialize each Student object
        }

        // Set roll and name for the first Student
        s[0].roll = new int[]{1, 2, 3};
        s[0].name = new String[]{"Hello", "Hello", "Hello"};

        // Set roll and name for the second Student
        s[1].roll = new int[]{10, 12, 14};
        s[1].name = new String[]{"Hello", "Hello", "Hello"};

        // Optionally, set roll and name for the third Student if needed
//         s[2].roll = new int[]{...};
//         s[2].name = new String[]{...};

        // Print the details of each student
        for (Student student : s) {
            System.out.println("Roll: " + Arrays.toString(student.roll));
            System.out.println("Name: " + Arrays.toString(student.name));
        }
    }
}
class Student {
    int[] roll = new int[5];
    String[] name = new String[5];
}
