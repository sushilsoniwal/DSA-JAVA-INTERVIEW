package Java.Java_Basics;

import java.util.*;

public class Control_Statements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter Your Age In Years:- ");
        int age = in.nextInt();

        if (age < 1 || age > 200) {
            System.out.println("Please Enter A Valid Age");
        } else if (age < 18) {
            System.out.println("You Can't Vote");
        } else {
            System.out.println("You Can Vote");
        }
        in.close();
    }

}
