package week01_Numerical;

import java.util.Scanner;

public class NSum01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n' value: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum +=i;

        }
        System.out.printf("Sum of first %d natural numbers: %d",n,sum);


    }
}
