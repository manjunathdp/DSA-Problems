package week01_Numerical;

import java.util.Scanner;

public class PalindromeNumber08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n' value: ");
        int n = sc.nextInt();
        int rev = 0;
        int temp = n;
        while (temp > 0) {
            int lastDigit = temp % 10;
            rev = rev * 10 + lastDigit;
            temp = temp / 10;
        }
        if (n == rev) {
            System.out.printf("%d is a Palindrome Number", n);
        } else {
            System.out.printf("%d is NOT a Palindrome Number", n);
        }
    }
}
