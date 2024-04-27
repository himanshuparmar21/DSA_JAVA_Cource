package Lecture_6_Functions_Methods;

public class Block_Scope {
    public static void main(String[] args) {
        int a = 10;

        {
            //int a = 20; // Already Create Then Not create But We Can Modify
            a = 15;
            int c = 50;
            //only block variable Work Block inside not work outside
            System.out.println(a); // 15
        }
        System.out.println(a); //15
        //System.out.println(c); // Cannot access c cannot use outside block
    }
}
/*
anything initialize outside block can access and cannot initialize inside block but anything initialize inside block we cannot access and can again initialize outside block
 */