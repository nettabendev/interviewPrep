package codility.distinctValuesInArray;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public int solution(int[] A) {
        // Implement your solution here
        int ans =0;
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i= 0;i<A.length;i++){
            if(map.containsKey(A[i])){
                //add to key
                int temp = map.get(A[i])+1;
                map.replace(A[i],temp);
            }
            else{
                map.put(A[i], 1);
            }
        }
        return map.values().size();
    }
}
