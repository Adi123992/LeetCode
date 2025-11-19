package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArr {
    public static void main(String[] args) {
        int[] arr1 = {9, 4, 9, 8, 4};
        int[] arr2 = {1, 4, 9};
        System.out.println(Arrays.toString(intersect(arr1, arr2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //count the frequency of numbers in nums1 array
        for (int num : nums1) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        //create a new array list and add those elements that are present in the map already my decreasing the frequency each time when found
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                list.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        int[] farr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            farr[i] = list.get(i);
        }
        return farr;
    }
}
