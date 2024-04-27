package Lecture_7_Array_ArrayList;

public class Main {
    public static void main(String[] args) {
        //Store 5 Student Roll Number
//        int[] roll = new int[5];
//        int roll2[] = new int[5]; Also Work
        //Directly Store
//        int[] roll1 = {1,2,3,4,5};


        int[] arr ; //Declaration of Array. arr is getting defined in the stack
        arr = new int[5]; //Initialization : actually here object is being created in the heap
    }
}

//Why We Need Array?
/*  Array Use To Store Similar Collection of Data */

//Syntax
// Data_Type[] variable_name = new Data_Type[size];

//Array Index Start With 0
//Ex. arr = [1,2,3,4,5] (print(arr[0]) => 1) (arr[2] = 10 then new arr = [1,2,10,4,5])
//All The Type in Array Are same
//Ex.: int[] arr = {1,2,3,"Hello"}; This is Not Valid Because String not Store in int Data Type
//in int array by default all Element is 0
//in String array by default all Element is null

//What is Null?
//String str = null; This is Valid We Can Assign Null only non-primitive Data Type

//new Keyword:
//new keyword is used to create an object(basically it's create object in heap given size length)

//in Stack Store Array Variable Name And Heap Store Array Object

//Point-1:Array Object in Heap
//Point-2:Heap Object are not continues(Continues means Object store one after one ,Not Store one after space and store after second)
//Point-3:Dynamic Memory Allocation
//So,May not be continues(Depend On JVM)