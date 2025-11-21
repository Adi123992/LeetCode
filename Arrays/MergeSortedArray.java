package Arrays;

import java.util.Arrays;

//m actual no. of elements belonging to nums1
//n actual no. of elements belonging to nums2
//m+n the size of nums1 after nums2 is added to it so n is basically the 0 placeholders over here
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;        // pointer for nums1
        int j = n - 1;        // pointer for nums2
        int k = m + n - 1;    // fill position in nums1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If nums2 still has elements, copy them
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 4, 5, 0, 0, 0};
        int[] nums2 = {3, 3, 4};
        merge(nums1, 4, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
