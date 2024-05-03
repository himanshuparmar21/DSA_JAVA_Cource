package Lecture_12_String_StringBuilder;

public class Performance {
    public static void main(String[] args) {
        String series = "";

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series += ch; // series = series + ch;
        }
        System.out.println(series);
    }
}

//in above program Some Problem When Run Loop Every Loop Create new String Object
// 1st Loop : series = "a";
// 2nd Loop : series = "ab";
// 3rd Loop : series = "abc";

//then every loop create new Object that is So memory Use

// Loop run every time then create:a,ab,abc,abcd,abcde,...
//then time Complexity : 0(n^2)

//To Solve this problem We can Use StringBuilder