package week01_Numerical;

import java.util.Scanner;

public class GCD03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int number1 = sc.nextInt();
        int t1 = number1;
        System.out.println("Enter Second Number: ");
        int number2 = sc.nextInt();
        int t2 = number2;
        while (number1 != number2) {
            if (number1 > number2) {
                number1 = number1 - number2;
            } else {
                number2 = number2 - number1;
            }
        }
        System.out.printf("GCD of %d and %d is: %d", t1, t2, number1);
    }
}
