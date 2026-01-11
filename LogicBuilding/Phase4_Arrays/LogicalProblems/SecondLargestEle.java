package LogicBuilding.Phase4_Arrays.LogicalProblems;

import java.util.Scanner;

public class SecondLargestEle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        int[] tempArr = arr;
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 1; j < n - i; j++) {
//                if (arr[j - 1] < arr[j]) {
//                    int temp = arr[j - 1];
//                    arr[j - 1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        //tempArr needs to be deep cloned coz shadow cloning doesnt work on arrays
//        System.out.println("Second largest element in : " + Arrays.toString(tempArr) + " is " + arr[1]);
        //O(N) approach :
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int a : arr) {
            if (max1 < a) {
                max2 = max1;
                max1 = a;
            } else if (a < max1 && a > max2) {
                max2 = a;
            }
        }
        System.out.println("Second max : " + max2);
    }
}
