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
            nums[i]=sc.nextInt();
        }
        System.out.print("Enter target value: ");
        int target = sc.nextInt();
        System.out.println(Arrays.toString(twoSum(nums,target)));

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

