package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] ans = rotate(arr, 3);
        System.out.println(Arrays.toString(ans));
    }

    public static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    public static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        //reverse the entire string
        reverse(nums, 0, n - 1);
        //reverse the first k elements
        reverse(nums, 0, k - 1);
        //reverse the later n-k elements
        reverse(nums, k, n - 1);
        return nums;
    }
}
