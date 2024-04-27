package Lecture_3_First_JAVA_Program;

public class Command_Line_Input_Using_args {
    public static void main(String[] args){
        System.out.println(args[1]);
        System.out.println(args[0]);
    }
}
//To Use This Program Pass Value Then We Compile Code(Ex.: java Command_Line_Input_Using_args "Hello" "HI")
//Then Print 1 Index Value("Hi")
//args is Just Array Of String class