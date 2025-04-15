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
        //System.out.println("Calling Test:");
        //test(nums);

        scanner.close();
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();

        for (int num : nums) {
            if (hm.containsKey(num)) {
                int value = hm.get(num);
                hm.put(num, value + 1);
            } else {
                hm.put(num, 1);
            }
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(hm.entrySet());
        entryList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int[] topK = new int[k];
        for (int i = 0; i < k; i++) {
            topK[i] = entryList.get(i).getKey();
        }

        return topK;
    }
//    public static void test(int[] arr) {
//        TreeMap<Integer,Integer> tm = new TreeMap<>();
//        for (int n : arr) {
//            if (tm.containsKey(n)) {
//                int value = tm.get(n);
//                value++;
//                tm.put(n,value);
//            } else {
//                tm.put(n,1);
//            }
//        }
//        System.out.println(tm);
//        List<Map.Entry<Integer,Integer>> entryListTest = new ArrayList<>(tm.entrySet());
//        entryListTest.sort((a, b) -> a.getValue().compareTo(b.getValue()));
//        System.out.println(entryListTest);
//    }
}
