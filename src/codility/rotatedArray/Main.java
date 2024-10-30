package codility.rotatedArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        // Test Case 1: Basic Rotation
        System.out.println("blablabl");

        int[] A1 = {3, 8, 9, 7, 6};
        int K1 = 3;
        int[] expected1 = {9, 7, 6, 3, 8};
        System.out.println(Arrays.equals(s.solution( A1, K1), expected1));

        // Test Case 2: Array with Identical Elements
        int[] A2 = {0, 0, 0};
        int K2 = 1;
        int[] expected2 = {0, 0, 0};
        System.out.println(Arrays.equals(s.solution( A2, K2), expected2));

        // Test Case 3: Rotation Equal to Array Length (No Change)
        int[] A3 = {1, 2, 3, 4};
        int K3 = 4;
        int[] expected3 = {1, 2, 3, 4};
        System.out.println(Arrays.equals(s.solution( A3, K3), expected3));

        // Test Case 4: Empty Array
        int[] A4 = {};
        int K4 = 10;
        int[] expected4 = {};
        System.out.println(Arrays.equals(s.solution( A4, K4), expected4));

        // Test Case 5: Rotation Greater than Array Length
        int[] A5 = {1, 2, 3, 4, 5};
        int K5 = 7;
        int[] expected5 = {4, 5, 1, 2, 3};
        System.out.println(Arrays.equals(s.solution( A5, K5), expected5));

        // Test Case 6: Single Element Array
        int[] A6 = {5};
        int K6 = 10;
        int[] expected6 = {5};
        System.out.println(Arrays.equals(s.solution( A6, K6), expected6));

        // Test Case 7: No Rotation (K = 0)
        int[] A7 = {1, 2, 3, 4};
        int K7 = 0;
        int[] expected7 = {1, 2, 3, 4};
        System.out.println(Arrays.equals(s.solution( A7, K7), expected7));
    }

}