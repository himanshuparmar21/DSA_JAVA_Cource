package Lecture_3_First_JAVA_Program;

public class Primitives {
    public static void main(String[] args){
        int num = 99;
//        int n = 233,999,000; Not Correct
        int n = 233_999_000; //This is Correct (233999000 This is Use Mostly) (When Print This Number That Print Without _)
        long largeNum = 989838874412L;
        float decimalNum = 99.99f;
        double largeDecimalNum = 999398.99897;
        boolean check = true;
    }
}
//Primitive Data Type Means Further Data Ty[pe Cannot Divide into Any Other Data Type (Like int to Char This is not Possible)
//String is Not Primitive Data Type Because That Can Convert int Character Data Type(like "Hello" => "H","e","l","l","o")
// Data Type int is Use to Store Integer Value
// To data Type Integer You Want To Write (233,999,000) This is Not Work in java To Write This use comma to _ (233_999_000) <= This is Work
// Data Type long is Use To Store Largest Integer Value
// Data Type float is Use To Store Decimal Number Value
// Data Type double is Use To Store Longest Decimal Number Value
// Data Type boolean is Use To Store true or false Value
// Data Type int,float is Store 4 byte
// Data Type lon,double is Store 8 byte
// Data type boolean is Store 1 byte