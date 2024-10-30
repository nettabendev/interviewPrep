package codility.missingElement;

public class missingElementTest {
    public static void main(String[] args) {
        Solution s = new Solution();

        // Test Case 1: Small gap
        int[] A1 = {2, 3, 1, 5};
        int expected1 = 4;
        System.out.println(s.solution(A1) == expected1);

        // Test Case 2: Single element
        int[] A2 = {2};
        int expected2 = 1;
        System.out.println(s.solution(A2) == expected2);

        // Test Case 3: No missing element, large gap
        int[] A3 = {1, 2, 3, 4, 6};
        int expected3 = 5;
        System.out.println(s.solution(A3) == expected3);

        // Test Case 4: Empty array
        int[] A4 = {};
        int expected4 = 1;
        System.out.println(s.solution(A4) == expected4);

        // Test Case 5: Array with only one missing number at the end
        int[] A5 = {1, 2, 3, 4};
        int expected5 = 5;
        System.out.println(s.solution(A5));
        System.out.println(s.solution(A5) == expected5);

        // Test Case 6: Array with maximum values
        int[] A6 = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        int expected6 = 4;
        System.out.println(s.solution(A6) == expected6);
    }
}
