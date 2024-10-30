package codility.frogJumps;

public class frojJumpsTest {

    public static void main(String[] args) {
        Solution s = new Solution();

        // Test Case 1
        int X1 = 10, Y1 = 85, D1 = 30;
        int expected1 = 3;
        System.out.println(s.solution(X1, Y1, D1) == expected1);

        // Test Case 2
        int X2 = 10, Y2 = 100, D2 = 90;
        int expected2 = 1;
        System.out.println(s.solution(X2, Y2, D2) == expected2);

        // Test Case 3
        int X3 = 0, Y3 = 0, D3 = 1;
        int expected3 = 0;
        System.out.println(s.solution(X3, Y3, D3) == expected3);

        // Test Case 4
        int X4 = 1, Y4 = 1_000_000, D4 = 999_999;
        int expected4 = 1;
        System.out.println(s.solution(X4, Y4, D4) == expected4);

        // Test Case 5
        int X5 = 10, Y5 = 11, D5 = 1;
        int expected5 = 1;
        System.out.println(s.solution(X5, Y5, D5) == expected5);

        // Test Case 6
        int X6 = 5, Y6 = 105, D6 = 20;
        int expected6 = 5;
        System.out.println(s.solution(X6, Y6, D6) == expected6);
    }
}
