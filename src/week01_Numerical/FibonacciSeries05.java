package week01_Numerical;

import java.util.Scanner;

public class FibonacciSeries05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n' value: ");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.print(0);
            return;
        }
        if (n == 2) {
            System.out.print(0 + " " + 1);
            return;
        }
        int first = 0;
        int second = 1;
        System.out.print(first + " " + second + " ");
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}
