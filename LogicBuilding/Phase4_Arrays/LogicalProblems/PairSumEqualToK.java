package LogicBuilding.Phase4_Arrays.LogicalProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class PairSumEqualToK {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the number : ");
        int k = s.nextInt();
        int count = 0;
        //brute force solution
        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k) count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Count : " + count);
        //optimized solution
        int count2 = 0;
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
            if (m.containsKey(k - arr[i])) {
                count2++;
            }
        }
        System.out.println("Count : " + count2);
    }
}
