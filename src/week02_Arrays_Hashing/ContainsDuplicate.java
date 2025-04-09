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
            nums[i]=sc.nextInt();
        }
        System.out.println(containsDuplicate(nums));

    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int ele : nums) {
            if(set.isEmpty()) {
                set.add(ele);
            } else if(!set.contains(ele)) {
                set.add(ele);
            } else {
                return true;
            }

        }
        return false;

    }
}
