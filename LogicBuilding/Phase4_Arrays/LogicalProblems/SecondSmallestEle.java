package LogicBuilding.Phase4_Arrays.LogicalProblems;

import java.util.Scanner;

public class SecondSmallestEle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.println("Enter size : ");
//        int n = s.nextInt();
//        int[] arr = new int[n];
//        int[] tempArr = arr;
//        for (int i = 0; i < n; i++) {
//            arr[i] = s.nextInt();
//        }
        int[] arr2 = {5, 4, 3, 2, 1};
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int x : arr2) {
            if (x < min1) {
                min2 = min1;
                min1 = x;
            } else if (x > min1 && x < min2) {
                min2 = x;
            }
        }
        System.out.println(min2);
    }
}
