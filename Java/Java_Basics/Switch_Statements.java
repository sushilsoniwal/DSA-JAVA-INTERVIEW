package Java.Java_Basics;

import java.util.Scanner;

public class Switch_Statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose A Colour");
        String colour = sc.next();

        switch (colour) {
            case "Red":
                System.out.println("It's An Apple");
                break;
            case "Yellow":
                System.out.println("It's A Banana");
                break;
            case "Green":
                System.out.println("It's A WaterMelon");
                break;
            default:
                System.out.println("Not The Required Fruit");
        }

        /*
         * New Syntax For Switch Statements.
         * switch (colour) {
         * case "Red" -> System.out.println("It's An Apple");
         * case "Yellow" -> System.out.println("It's A Banana");
         * case "Green" -> System.out.println("It's A WaterMelon");
         * default -> System.out.println("Not The Required Fruit");
         * }
         */

        sc.close();
    }
}
