package LogicBuilding.Phase4_Arrays.Searching_Counting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PerfectSq {
    //TC: O(logn)
    //SC: O(1)
    public static boolean binarySearch(int n) {
        int s = 1;
        int e = n;
        while (s <= e) {
            int m = (s + e) / 2;
            if (m * m == n) {
                return true;
            } else if (m * m > n) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        for (int a : arr) {
            for (int i = 0; i * i <= a; i++) {
                if (i * i == a) list.add(a);
            }
        }
        System.out.println("List of perfect squares from " + Arrays.toString(arr) + " is : " + list);
        System.out.println("Via binary search ..");
        List<Integer> list2 = new ArrayList<>();
        for (int a : arr) {
            if (binarySearch(a)) {
                list2.add(a);
            }
        }
        System.out.println("List of perfect squares from " + Arrays.toString(arr) + " is : " + list2);

    }
}
