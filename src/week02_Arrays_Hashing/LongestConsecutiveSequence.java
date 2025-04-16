package week02_Arrays_Hashing;

import java.util.*;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        TreeSet<Integer> seqList = new TreeSet<>();
        int seq = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue; // skip duplicates
            } else if (nums[i] + 1 == nums[i + 1]) {
                seq++;
            } else {
                seqList.add(seq);
                seq = 1;
            }
        }

        seqList.add(seq); // Add the last sequence
        return seqList.last();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int result = longestConsecutive(nums);

        System.out.println("Length of the longest consecutive sequence: " + result);
    }
}
