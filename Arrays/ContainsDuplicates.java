package Arrays;

import java.util.HashSet;

public class ContainsDuplicates {
    public static void main(String[] args) {
        ContainsDuplicates c = new ContainsDuplicates();
        int[] arr = {1, 2, 3, 1};
        System.out.println(c.containsDuplicate(arr));

    }

    public boolean containsDuplicate(int[] nums) {
        //Brute Force appraoch
        //Time complexity : O(n2)
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    return true;
//                }
//            }
//        }
//        return false;
        //Optimized Solution
        //Time Complexity : O(1)
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}