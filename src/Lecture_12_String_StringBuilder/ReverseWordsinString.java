package Lecture_12_String_StringBuilder;

public class ReverseWordsinString {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }
    public static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();

        for (String temp : s.split("\\s+")){
            ans.insert(0, temp + " ");
        }
        return ans.toString().trim();
    }
}

//\\s: This is a shorthand character class in regular expressions that matches any whitespace character, including:
//
//A space (" ")
//A tab (\t)
//A newline (\n)
//A carriage return (\r)
//A form feed (\f)
//+: This is a quantifier in regex that means "one or more". So, \\s+ matches one or more consecutive whitespace characters.

//Ex.
//String str = "Hello   I'm your String";
//String[] splitStr1 = str.split(" ");  // Using " " as delimiter
//String[] splitStr2 = str.split("\\s+");  // Using "\\s+" as delimiter
//
//// Output of splitStr1: ["Hello", "", "", "I'm", "your", "String"]
//// Output of splitStr2: ["Hello", "I'm", "your", "String"]
