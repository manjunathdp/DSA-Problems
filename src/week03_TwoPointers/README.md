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
# Question 02 Problem: Two Sum II - Input Array Is Sorted

## 📝 Problem Statement

Given a 1-indexed array of integers `numbers` that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be `numbers[index1]` and `numbers[index2]` where `1 <= index1 < index2 <= numbers.length`.

Return the indices of the two numbers, `index1` and `index2`, added by one as an integer array `[index1, index2]` of length 2.

The tests are generated such that there is exactly one solution.  
You may not use the same element twice.  
Your solution must use only constant extra space.

---

## 📘 Examples

### Example 1:
**Input:**  
`numbers = [2,7,11,15]`, `target = 9`  
**Output:**  
`[1,2]`  
**Explanation:**  
The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2.

### Example 2:
**Input:**  
`numbers = [2,3,4]`, `target = 6`  
**Output:**  
`[1,3]`  
**Explanation:**  
The sum of 2 and 4 is 6. Therefore, index1 = 1, index2 = 3.

### Example 3:
**Input:**  
`numbers = [-1,0]`, `target = -1`  
**Output:**  
`[1,2]`  
**Explanation:**  
The sum of -1 and 0 is -1. Therefore, index1 = 1, index2 = 2.

---

## 💡 Java Solution

```java
package week03_TwoPointers;

import java.util.Scanner;
import java.util.Arrays;

public class TwoSumFinder {

    public static int[] twoSum(int[] numbers, int target) {
        int[] output = new int[2];
        int front = 0;
        int rare = numbers.length - 1;
        while (rare > front) {
            int sum = numbers[front] + numbers[rare];
            if (target == sum) {
                output[0] = front + 1;
                output[1] = rare + 1;
                break;
            }
            if (sum > target) {
                rare--;
            } else {
                front++;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter " + n + " sorted integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        int[] result = twoSum(numbers, target);
        if (result[0] != 0 || result[1] != 0) {
            System.out.println("Indices (1-based) of the two numbers: " + Arrays.toString(result));
        } else {
            System.out.println("No two numbers found with the given target sum.");
        }

        scanner.close();
    }
}
```
---