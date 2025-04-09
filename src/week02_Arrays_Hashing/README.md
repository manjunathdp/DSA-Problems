#  Question 01 Two Sum - Brute Force Approach (Java)

## 📝 Problem Statement

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`.

- Each input has exactly one solution.
- You may not use the same element twice.
- Return the answer in any order.

---

## 📘 Examples

### Example 1:
**Input:**  
`nums = [2,7,11,15]`, `target = 9`  
**Output:**  
`[0,1]`  
**Explanation:**  
Because `nums[0] + nums[1] == 9`, we return `[0, 1]`.

### Example 2:
**Input:**  
`nums = [3,2,4]`, `target = 6`  
**Output:**  
`[1,2]`

### Example 3:
**Input:**  
`nums = [3,3]`, `target = 6`  
**Output:**  
`[0,1]`

---

## 💡 Brute Force Java Solution

```java
package week02_Arrays_Hashing;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n' value: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter Array value: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target value: ");
        int target = sc.nextInt();
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    output[0] = i;
                    output[1] = j;
                    break;
                }
            }
        }
        return output;
    }
}
