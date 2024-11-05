package codility.TapeEquilibrium;


public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1: Basic example from problem description
        int[] A1 = {3, 1, 2, 4, 3};
        System.out.println(solution.solution(A1) == 1 ? "Passed" : "Failed");

        // Test Case 2: Array with positive and negative numbers
        int[] A2 = {5, -2, 3, -1, 4};
        System.out.println(solution.solution(A2) == 1 ? "Passed" : "Failed");

        // Test Case 3: Smallest possible array with two elements


        // Test Case 4: All elements are the same
        int[] A4 = {10, 10, 10, 10};
        System.out.println(solution.solution(A4) == 0 ? "Passed" : "Failed");

        // Test Case 5: Array with alternating large positive and negative values
        int[] A5 = {1000, -1000, 1000, -1000};
        System.out.println(solution.solution(A5) == 0 ? "Passed" : "Failed");

        // Test Case 6: Increasing sequence
        int[] A6 = {1, 2, 3, 4, 5};
        System.out.println(solution.solution(A6) == 3 ? "Passed" : "Failed");

        // Test Case 7: Decreasing sequence
        int[] A7 = {5, 4, 3, 2, 1};
        System.out.println(solution.solution(A7) == 3 ? "Passed" : "Failed");

        // Test Case 8: Array with two large elements
        int[] A8 = {1000, -1000};

        // Test Case 9: Single element repeated multiple times
        int[] A9 = {7, 7, 7, 7, 7};
        System.out.println(solution.solution(A9) == 7 ? "Passed" : "Failed");
    }
}
