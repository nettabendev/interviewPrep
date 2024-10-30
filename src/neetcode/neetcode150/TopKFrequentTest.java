package neetcode.neetcode150;


import neetcode.neetcode150.Solution;

import java.util.Arrays;

public class TopKFrequentTest {

    public static void main(String[] args) {
        Solution s = new Solution();

        // Test Case 1: Basic test with clear frequency differences
        int[] nums1 = {1, 2, 2, 3, 3, 3};
        int k1 = 2;
        int[] expected1 = {2, 3};
        int[] result1 = s.topKFrequent(nums1, k1);
        Arrays.sort(result1); // Sort both arrays before comparison
        Arrays.sort(expected1);
        System.out.println("Test Case 1 Passed: " + Arrays.equals(result1, expected1));

        // Test Case 2: Only one distinct number, repeated multiple times
        int[] nums2 = {7, 7};
        int k2 = 1;
        int[] expected2 = {7};
        int[] result2 = s.topKFrequent(nums2, k2);
        Arrays.sort(result2);
        Arrays.sort(expected2);
        System.out.println("Test Case 2 Passed: " + Arrays.equals(result2, expected2));

        // Test Case 3: All unique numbers, should return any k elements
        int[] nums3 = {1, 2, 3, 4, 5};
        int k3 = 3;
        int[] result3 = s.topKFrequent(nums3, k3);
        System.out.println("Test Case 3 Passed: " + (result3.length == k3));

        // Test Case 4: Test with negative numbers
        int[] nums4 = {-1, -1, -2, -2, -2, -3};
        int k4 = 2;
        int[] expected4 = {-1, -2};
        int[] result4 = s.topKFrequent(nums4, k4);
        Arrays.sort(result4);
        Arrays.sort(expected4);
        System.out.println("Test Case 4 Passed: " + Arrays.equals(result4, expected4));

        // Test Case 5: Large k value
        int[] nums5 = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        int k5 = 4;
        int[] result5 = s.topKFrequent(nums5, k5);
        System.out.println("Test Case 5 Passed: " + (result5.length == k5));
    }
}
