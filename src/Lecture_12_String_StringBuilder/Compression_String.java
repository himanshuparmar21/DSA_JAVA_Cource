package Lecture_12_String_StringBuilder;

public class Compression_String {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        String c = a;

//        == is uSe to Compare Two String This Compare Both String Value and also Change Both String Pointing TO same Object or not(References variable)
        System.out.println(a == b); // true Because a and b Both Have same value and Pointing to same object
        System.out.println(c == a); //true

        String s1 = "Hello";
        String s2 = new String("Hello");
        System.out.println(s1 == s2);// false bcz String s1 and s2 Have same Value But Not pointing to same object bcz s2 create new object
        System.out.println(s1.equals(s2)); //true bcz .equals() method just check strings value

        System.out.println(s1.charAt(0));// H

//      to Access Character from given String We can get Using Variable_Name.charAt(index) method
    }
}


//How To create Different Object With Same value
//String a = new String("Hello");
//String b = new String("Hello");
//This is Create outside of String pool but inside of Heap

//When only need to check value use .equals() Method
//Ex.: a.equals(b);