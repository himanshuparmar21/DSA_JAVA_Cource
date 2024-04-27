package Lecture_5_Switch_Case;

import java.util.Scanner;

public class Nested_Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String dept = sc.next();

        switch (empID){
            case 1:
                System.out.println("Himanshu");
                break;
            case 2:
                switch (dept){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Manager":
                        System.out.println("Manager");
                        break;
                    default:
                        System.out.println("Invalid Department");
                        break;
                }
                break;
            default:
                System.out.println("Invalid");
                break;
        }


        switch (empID) {
            case 1 -> System.out.println("Himanshu");
            case 2 -> {
                switch (dept) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Manager":
                        System.out.println("Manager");
                        break;
                    default:
                        System.out.println("Invalid Department");
                        break;
                }
                /*switch (dept) {
                    case "IT" -> System.out.println("IT Department");
                    case "Manager" -> System.out.println("Manager");
                    default -> System.out.println("Invalid Department");
                }*/
            }
            default -> System.out.println("Invalid");
        }
    }
}
