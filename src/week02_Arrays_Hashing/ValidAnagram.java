package week02_Arrays_Hashing;

import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String s: ");
        String s = sc.next();
        System.out.print("Enter String t: ");
        String t = sc.next();
        System.out.println("Is given strings are Valid Anagrams: "+isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        s= new String(s1);
        t= new String(t1);
        return s.equals(t);
    }
}
