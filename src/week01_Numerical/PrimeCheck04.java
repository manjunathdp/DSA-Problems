package week01_Numerical;

import java.util.Scanner;

public class PrimeCheck04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n' value: ");
        int n = sc.nextInt();
        boolean primeCheck=true;
        for (int i = 2; i < n; i++) {
            if(n%i==0) {
                primeCheck=false;
                break;
            }
        }
        if (primeCheck) {
            System.out.printf("%d is a Prime number",n);
        } else {
            System.out.printf("%d is a NOT Prime number",n);
        }
    }
}
