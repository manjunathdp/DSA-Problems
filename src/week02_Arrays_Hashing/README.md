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
```
---
# Question 02 Contains Duplicate - HashSet Approach (Java)

## 📝 Problem Statement

Given an integer array `nums`, return `true` if any value appears **at least twice** in the array, and return `false` if **every element is distinct**.

---

## 📘 Examples

### Example 1:
**Input:**  
`nums = [1,2,3,1]`  
**Output:**  
`true`  
**Explanation:**  
The element `1` occurs at indices `0` and `3`.

---

### Example 2:
**Input:**  
`nums = [1,2,3,4]`  
**Output:**  
`false`  
**Explanation:**  
All elements are distinct.

---

### Example 3:
**Input:**  
`nums = [1,1,1,3,3,4,3,2,4,2]`  
**Output:**  
`true`

---

## 💡 Java Code (Using HashSet)

```java
package week02_Arrays_Hashing;

import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n' value: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter Array value: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int ele : nums) {
            if (set.isEmpty()) {
                set.add(ele);
            } else if (!set.contains(ele)) {
                set.add(ele);
            } else {
                return true;
            }
        }
        return false;
    }
}
```
---
# Question 03 Valid Anagram - Sorting Approach (Java)

## 📝 Problem Statement

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

An **anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

---

## 📘 Examples

### Example 1:
**Input:**  
`s = "anagram"`, `t = "nagaram"`  
**Output:**  
`true`

---

### Example 2:
**Input:**  
`s = "rat"`, `t = "car"`  
**Output:**  
`false`

---

## 💡 Java Code (Sorting-Based Solution)

```java
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
        System.out.println("Is given strings are Valid Anagrams: " + isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        s = new String(s1);
        t = new String(t1);
        return s.equals(t);
    }
}
```
---
# Question 03 Group Anagrams - HashMap + Sorting Approach (Java)

## 📝 Problem Statement

Given an array of strings `strs`, group the anagrams together.  
You can return the answer in **any order**.

---

## 📘 Examples

### Example 1:
**Input:**  
`strs = ["eat","tea","tan","ate","nat","bat"]`  
**Output:**  
`[["bat"],["nat","tan"],["ate","eat","tea"]]`  
**Explanation:**
- "ate", "eat", and "tea" are anagrams.
- "tan" and "nat" are anagrams.
- "bat" has no anagram match.

---

### Example 2:
**Input:**  
`strs = [""]`  
**Output:**  
`[[""]]`

---

### Example 3:
**Input:**  
`strs = ["a"]`  
**Output:**  
`[["a"]]`

---

## 💡 Java Code (HashMap + Sorted String Keys)

```java
package week02_Arrays_Hashing;

import java.util.*;

public class AnagramGrouper {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars); // This acts as the key

            // Put the string in the correct anagram group
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] strs = new String[n];
        System.out.println("Enter the strings one by one:");
        for (int i = 0; i < n; i++) {
            strs[i] = scanner.nextLine();
        }

        List<List<String>> result = groupAnagrams(strs);

        System.out.println("Grouped Anagrams:");
        for (List<String> group : result) {
            System.out.println(group);
        }

        scanner.close();
    }
}
```
---