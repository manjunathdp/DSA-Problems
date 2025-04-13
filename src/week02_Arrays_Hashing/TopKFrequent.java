package week02_Arrays_Hashing;

import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Input the value of k
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        // Get the top k frequent elements
        int[] result = topKFrequent(nums, k);

        // Print the result
        System.out.println("Top " + k + " frequent elements:");
        System.out.println(Arrays.toString(result));

        scanner.close();
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();

        // Count frequency of each element
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        // Convert map entries to a list and sort by frequency
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(hm.entrySet());
        entryList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Collect top k frequent elements
        int[] topK = new int[k];
        for (int i = 0; i < k; i++) {
            topK[i] = entryList.get(i).getKey();
        }

        return topK;
    }
}
