package Arrays.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> list = threeSum(arr);
        System.out.println(list);

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        //sort the array
        Arrays.sort(nums);
        //make a new arraylist
        List<List<Integer>> res = new ArrayList<>();
        //run loop till length - 2
        for (int i = 0; i < nums.length - 2; i++) {
            //if same number then skip to prevent repeated pairs
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            int first = -1 * nums[i];//maths expression
            while (left < right) {
                int target = nums[left] + nums[right];
                if (target == first) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    //if there are any duplicates on way just skip them
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
                //if target doesn't match then skip accordingly
                else if (target < first) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }
}