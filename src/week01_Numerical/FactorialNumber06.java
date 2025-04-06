package week01_Numerical;

import java.util.Scanner;

public class FactorialNumber06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n' value: ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.printf("Factorial of %d is: %d", n, fact);
    }
}
