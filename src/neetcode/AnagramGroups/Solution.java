package neetcode.AnagramGroups;

import java.util.*;

public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {


        Map<String, List<String>> res = new HashMap<>();
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            String keyString = new String(chars);

            res.putIfAbsent( keyString, new ArrayList<>());
            res.get(keyString).add(s);
        }

        List<List<String>> ans = new ArrayList(res.values());

        return ans;

    }



}


