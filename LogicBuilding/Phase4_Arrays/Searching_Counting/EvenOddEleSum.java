package LogicBuilding.Phase4_Arrays.Searching_Counting;

import java.util.Scanner;

public class EvenOddEleSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int evsum = 0;
        int odsum = 0;
        for (int a : arr) {
            if (a % 2 == 0) evsum += a;
            else odsum += a;
        }
        System.out.println("Even sum of array elements is : " + evsum);
        System.out.println("Odd sum of array elements is : " + odsum);
    }
}
