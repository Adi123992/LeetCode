package Arrays.TwoPointers;

import java.util.Arrays;

//DNF algorithm
public class SortColors {
    public static void sortColors(int[] arr) {
        int left = 0;
        int mid = 0;
        int right = arr.length - 1;
        while (mid <= right) {
            if (arr[mid] == 0) {
                swap(arr, left, mid);
                left++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, right);
                right--;
            }
        }
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 0, 1, 2, 0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}
