package Lecture_3_First_JAVA_Program;

public class Type_Casting_Converted {
    public static void main(String[] args) {
        int n = 10;
        float a = n;
        double b = n;
        long c = n;

//        Type Casting
        a = (float) b;
        n = (int) c;


        int temp = 257;
        byte x = (byte) temp; // Byte Store only 256 So, 257 % 256 = 1
        System.out.println(x);

        byte y = 50;
        y = (byte) (50 * y);


        int z = 'a'; // Print ASCII Value of Character
        System.out.println(z);

        System.out.println("પહુગપ્");
    }
}

// int not Contain Float or Double or Long Value Only int Value Contain
// Float Value Contain Float and int Value
// Double Value Contain float , double and int Value
// long Contain int and long Value