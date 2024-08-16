package Lecture_7_Array_ArrayList;

import java.util.ArrayList;

public class ArrayList_Examples {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list.contains(20)); //list.contains(element) this method check if given element present in array than that return true else false
        list.set(2,50); // This Method is Update Given index given Element (list.set(index,element))
        list.remove(2); //remove element from given index (list.remove(index))
//        list.clear(); this remove all Element

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); // list.get(index) return given index element
        }
        System.out.println(list);
    }
}

// ArrayList<Data_Type> Variable_name = new ArrayList<>();
// ArrayList<Data_Type> Variable_name = new ArrayList<Integer>(Default_size); Data Specified is not Mandatory in before new keyWord

//add() method add Element in ArrayList