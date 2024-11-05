package codility.TapeEquilibrium;

import java.util.Arrays;

public class Solution {


    public int solution(int[] A){
        int[] sums = new int[A.length-2];
        for(int p =1;p<A.length-1;p++){
            int part1 =0, part2 =0;
            for(int j=0;j<p;j++){
                part1= part1+A[j];
            }
            for(int j =p;j<A.length;j++){
                part2= part2+A[j];
            }
            sums[p-1]=Math.abs(part1-part2);

        }
        int ans =sums[0];
        for(int i=1;i<sums.length;i++){
            if(sums[i]<ans){
                ans= sums[i];
            }
        }
        return ans;
    }
}
