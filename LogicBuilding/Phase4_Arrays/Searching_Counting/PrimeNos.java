package LogicBuilding.Phase4_Arrays.Searching_Counting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrimeNos {
    public static boolean prime(int n) {
        if (n == 1) return false;
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        int[] arr1 = {1, 13, 19, 9, 5};
        for (int a : arr1) {
            if (prime(a)) list.add(a);
        }
        System.out.println("Prime nos. in arr : " + Arrays.toString(arr) + " are : " + list);

    }
}
