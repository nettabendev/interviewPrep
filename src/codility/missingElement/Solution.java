package codility.missingElement;

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        int[] B = A.clone();
        Arrays.sort(B);
        if(B.length ==0)
            return 1;
        for(int i=0;i<B.length;i++){
            if(B[i]!= i+1)
                return i+1;
        }

        return B.length+1;
    }
}