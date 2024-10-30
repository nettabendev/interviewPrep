package neetcode.AnagramGroups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://neetcode.io/problems/anagram-groups
public class AnagramGroupsTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        String[] strs1 = {"act", "pots", "tops", "cat", "stop", "hat"};
        List<List<String>> expected1 = Arrays.asList(
                Arrays.asList("hat"),
                Arrays.asList("act", "cat"),
                Arrays.asList( "pots", "tops","stop")
        );
        List<List<String>> output1 =solution.groupAnagrams(strs1);
        System.out.println(output1.containsAll(expected1)&&expected1.containsAll(output1)); // Expected output: true

        // Test case 2
        String[] strs2 = {"x"};
        List<List<String>> expected2 = Arrays.asList(
                Arrays.asList("x")
        );
        List<List<String>> output2 =solution.groupAnagrams(strs2);
        System.out.println(output2.containsAll(expected2)&&expected2.containsAll(output2));  // Expected output: true

        // Test case 3
        String[] strs3 = {""};
        List<List<String>> expected3 = Arrays.asList(
                Arrays.asList("")
        );
        List<List<String>> output3 =solution.groupAnagrams(strs3);
        System.out.println(output3.containsAll(expected3)&&expected3.containsAll(output3)); ; // Expected output: true

        // Test case 4: All strings are unique (no anagrams)
        String[] strs4 = {"dog", "cat", "bat", "rat"};
        List<List<String>> expected4 = Arrays.asList(
                Arrays.asList("dog"),
                Arrays.asList("cat"),
                Arrays.asList("bat"),
                Arrays.asList("rat")
        );
        List<List<String>> output4 =solution.groupAnagrams(strs4);
        System.out.println(output4.containsAll(expected4)&&expected4.containsAll(output4)); ; // Expected output: true

        // Test case 5: Empty input array
        String[] strs5 = {};
        List<List<String>> expected5 = new ArrayList<>();  // Expected an empty list
        List<List<String>> output5 =solution.groupAnagrams(strs5);
        System.out.println(output5.containsAll(expected5)&&expected5.containsAll(output5)); ; // Expected output: true

        // Test case 6: Strings with varying lengths
        String[] strs6 = {"abc", "bca", "abcd", "dcba", "a"};
        List<List<String>> expected6 = Arrays.asList(
                Arrays.asList("abc", "bca"),
                Arrays.asList("abcd", "dcba"),
                Arrays.asList("a")
        );
        List<List<String>> output6 =solution.groupAnagrams(strs6);
        System.out.println(output6.containsAll(expected6)&&expected6.containsAll(output6)); ; // Expected output: true
    }
}
