#  Question 01 Problem: Valid Palindrome

## 📝 Problem Statement

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string `s`, return `true` if it is a palindrome, or `false` otherwise.

---

## 📘 Examples

### Example 1:
**Input:**  
`s = "A man, a plan, a canal: Panama"`  
**Output:**  
`true`  
**Explanation:**  
"amanaplanacanalpanama" is a palindrome.

### Example 2:
**Input:**  
`s = "race a car"`  
**Output:**  
`false`  
**Explanation:**  
"raceacar" is not a palindrome.

### Example 3:
**Input:**  
`s = " "`  
**Output:**  
`true`  
**Explanation:**  
The string is empty after removing non-alphanumeric characters, and an empty string reads the same forward and backward, making it a palindrome.

---

## 💡 Java Solution

```java
package week03_TwoPointers;

import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(ch))
                sb.append(ch);
        }
        if (sb.isEmpty()) {
            return true;
        }
        return sb.toString().contentEquals(sb.reverse());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }

        scanner.close();
    }
}
```
---