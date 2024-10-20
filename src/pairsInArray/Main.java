package pairsInArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        // Test Case 1
        int[] A1 = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(s.solution(A1) == 7); // Expected: true

        // Test Case 2
        int[] A2 = {1, 1, 2, 2, 3, 3, 4};
        System.out.println(s.solution(A2) == 4); // Expected: true

        // Test Case 3
        int[] A3 = {-1, -1, -2, -2, -3};
        System.out.println(s.solution(A3) == -3); // Expected: true

        // Test Case 4
        int[] A4 = {1000000000, 1000000000, 999999999};
        System.out.println(s.solution(A4) == 999999999); // Expected: true

        // Test Case 5
        int[] A5 = {5, 5, 3, 2, 2, 4, 4};
        System.out.println(s.solution(A5) == 3); // Expected: true

        // Test Case 6
        int[] A6 = {10, 20, 10, 20, 30};
        System.out.println(s.solution(A6) == 30); // Expected: true

        // Test Case 7
        int[] A7 = {1, 2, 1, 3, 3, 2, 4};
        System.out.println(s.solution(A7) == 4); // Expected: true

        int[] A8 = {1, 2, 1, 3, 3, 2, 1};
        System.out.println(s.solution(A8) == 1); // Expected: true
    }
}