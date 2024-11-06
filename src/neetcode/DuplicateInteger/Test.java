package neetcode.DuplicateInteger;

public class Test {
    public static void main(String[] args) {
        Solution duplicateInteger = new Solution();

        // Test case 1: Contains duplicate
        int[] nums1 = {1, 2, 3, 3};
        System.out.println("Test case 1: " + (duplicateInteger.hasDuplicate(nums1) ? "Passed" : "Failed"));

        // Test case 2: No duplicate
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Test case 2: " + (!duplicateInteger.hasDuplicate(nums2) ? "Passed" : "Failed"));

        // Additional test cases
        int[] nums3 = {};
        System.out.println("Test case 3 (empty array): " + (!duplicateInteger.hasDuplicate(nums3) ? "Passed" : "Failed"));

        int[] nums4 = {1, 1, 1, 1};
        System.out.println("Test case 4 (all duplicates): " + (duplicateInteger.hasDuplicate(nums4) ? "Passed" : "Failed"));

        int[] nums5 = {10, 20, 30, 40, 50};
        System.out.println("Test case 5 (no duplicates): " + (!duplicateInteger.hasDuplicate(nums5) ? "Passed" : "Failed"));
    }
}

