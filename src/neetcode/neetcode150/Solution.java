package neetcode.neetcode150;

import java.util.Collections;
import java.util.HashMap;

public class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        //now we have a map with all values

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            int value = Collections.max(map.values());
            for (int o : map.keySet()) {
                if (map.get(o).equals(value)) {
                    ans[i] = o;
                    map.remove(o);
                    break;
                }

            }

        }
        return ans;
    }}