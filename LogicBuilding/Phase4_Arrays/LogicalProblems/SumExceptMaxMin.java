package LogicBuilding.Phase4_Arrays.LogicalProblems;

import java.util.Arrays;
import java.util.Scanner;

public class SumExceptMaxMin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int a : arr) {
            sum += a;
            if (a > max) max = a;
            if (a < min) min = a;
        }
        System.out.println("The sum of arr " + Arrays.toString(arr) + " without max and min is : " + (sum - max - min));
    }
}
