package week01_Numerical;

import java.util.Scanner;

public class ArmstrongNumber07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n' value: ");
        int n = sc.nextInt();
        int digitCount=0;
        int temp = n;
        while (temp>0){
            temp=temp/10;
            digitCount++;
        }
        double aStrong=0;
        temp=n;
        while (temp>0) {
            int lastDigit=0;
            aStrong=aStrong+Math.pow(lastDigit,digitCount);
        }
    }
}
