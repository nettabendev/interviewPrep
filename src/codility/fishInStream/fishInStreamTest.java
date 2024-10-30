package codility.fishInStream;

public class fishInStreamTest {
    public static void main(String[] args) {
        Solution s = new Solution();

        // Test Case 1: Simple case with interaction
        int[] A1 = {4, 3, 2, 1, 5};
        int[] B1 = {0, 1, 0, 0, 0};
        int expected1 = 2;  // Only fish 0 and fish 4 survive.
        System.out.println(s.solution(A1, B1) == expected1);

        // Test Case 2: All fish moving downstream
        int[] A2 = {1, 2, 3, 4, 5};
        int[] B2 = {1, 1, 1, 1, 1};
        int expected2 = 5;  // No fish meet, all survive.
        System.out.println(s.solution(A2, B2) == expected2);

        // Test Case 3: All fish moving upstream
        int[] A3 = {5, 4, 3, 2, 1};
        int[] B3 = {0, 0, 0, 0, 0};
        int expected3 = 5;  // No fish meet, all survive.
        System.out.println(s.solution(A3, B3) == expected3);

        // Test Case 4: One fish
        int[] A4 = {10};
        int[] B4 = {0};
        int expected4 = 1;  // Only one fish, so it survives.
        System.out.println(s.solution(A4, B4) == expected4);

        // Test Case 5: Complex interactions
        int[] A5 = {6, 8, 10, 7, 5};
        int[] B5 = {1, 0, 0, 1, 0};
        int expected5 = 3;  // Fish 0 and 3 will be eaten, fish 1, 2, and 4 survive.
        System.out.println(s.solution(A5, B5) == expected5);

        // Test Case 6: Fish alternately flowing upstream and downstream
        int[] A6 = {5, 3, 6, 2, 7, 4};
        int[] B6 = {1, 0, 1, 0, 1, 0};
        int expected6 = 3;  // Fish 0 eats fish 1, fish 2 eats fish 3, fish 4 eats fish 5. Fish 0, 2, and 4 survive.
        System.out.println(s.solution(A6, B6) == expected6);

        // Test Case 7: Largest fish flowing upstream
        int[] A7 = {5, 10, 8, 9, 7};
        int[] B7 = {1, 1, 1, 1, 0};
        int expected7 = 4;  // No fish flowing upstream meet any fish flowing downstream, so all survive.
        System.out.println(s.solution(A7, B7));
        System.out.println(s.solution(A7, B7) == expected7);
    }
}
