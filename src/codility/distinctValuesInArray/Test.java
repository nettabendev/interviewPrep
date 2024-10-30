package codility.distinctValuesInArray;
//https://app.codility.com/c/run/trainingFWY45X-PJ2/

public class Test {

    public static void main(String[] args) {

        Solution s = new Solution();
        int[] A1 = {-1, -1, -2, -2, -3};
        int expected1 = 3;
        System.out.println(expected1==s.solution(A1));

        int[] A2 = {-1, -1, -1, -1, -1};
        int expected2 = 1;
        System.out.println(expected2==s.solution(A2));

        int[] A3 = {};
        int expected3 = 0;
        System.out.println(expected3==s.solution(A3));

        int[] A4 = {-1, 2, 1, 5, 0};
        int expected4 = 5;
        System.out.println(expected4==s.solution(A4));

        int[] A5 = { -1, 1, -2, 2};
        int expected5 = 4;
        System.out.println(expected5==s.solution(A5));

        int[] A6 = { -1};
        int expected6 = 1;
        System.out.println(expected6==s.solution(A6));

        int[] A7 = {-1000000, -1000000, 1000000};
        int expected7 =2;
        System.out.println(expected7==s.solution(A7));




    }
}
