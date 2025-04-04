package week01_Numerical;

import java.util.Scanner;

public class ReverseNumber02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n' value: ");
        int n = sc.nextInt();
        int rev=0;
        while(n>0) {
            int lastDigit=n%10;
            rev=(rev*10)+lastDigit;
            n=n/10;

        }
        System.out.println(rev);
    }
}
