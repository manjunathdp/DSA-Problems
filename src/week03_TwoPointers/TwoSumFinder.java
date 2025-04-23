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
