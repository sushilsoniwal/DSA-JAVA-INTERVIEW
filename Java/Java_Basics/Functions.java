package Java.Java_Basics;

public class Functions {

    public static void main(String[] args) {
        int a = 34, b = 16;
        System.out.printf("Before Swapping A = %d & B = %d \n", a, b);
        swap2(a, b);
    }

    // Function to swap two numbers using third variable.
    static void swap1(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.printf("After Swapping A = %d & B = %d \n", num1, num2);
    }

    // Function to swap two numbers without using third variable.
    static void swap2(int num1, int num2) {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.printf("After Swapping A = %d & B = %d \n", num1, num2);
    }
}
