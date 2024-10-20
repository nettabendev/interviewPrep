package rotatedArray;

import java.lang.reflect.Array;

public class Solution {

    public static int[] solution(int[] A, int K) {
        // Implement your solution here
        int[] ans = new int[A.length];
        int newIndex;
        for (int i = 0; i < A.length; i++) {
            newIndex = (i + K) % A.length;
            ans[newIndex] = A[i];
        }
        return ans;
    }

}


