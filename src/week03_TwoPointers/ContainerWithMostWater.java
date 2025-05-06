package week03_TwoPointers;
import java.util.Scanner;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int largestArea = 0;

        while (end > start) {
            int width = end - start;
            int h;
            if (height[start] < height[end]) {
                h = height[start];
                start++;
            } else {
                h = height[end];
                end--;
            }
            int area = h * width;
            if (area > largestArea) {
                largestArea = area;
            }
        }
        return largestArea;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertical lines: ");
        int n = scanner.nextInt();
        int[] height = new int[n];

        System.out.println("Enter the heights of the lines:");
        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }

        int result = maxArea(height);
        System.out.println("Maximum area of water the container can hold: " + result);

        scanner.close();
    }
}

