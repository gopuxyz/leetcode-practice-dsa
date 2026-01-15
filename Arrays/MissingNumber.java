// ======================================
// Problem: Missing Number
// Data Structure: Array
// Approach: Sum Formula
// Time Complexity: O(n)
// Space Complexity: O(1)
// ======================================

public class MissingNumber {

    public static int missingNumber(int[] arr) {
        int n = arr.length;
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 5, 6, 7, 8};

        int result = missingNumber(arr);
        System.out.println("Missing number is: " + result);
    }
}
