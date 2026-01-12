package LogicBuilding.Phase4_Arrays.LogicalProblems;

import java.util.Scanner;

public class GreaterThanAvg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        int avg = sum / n;
        int count = 0;
        for (int a : arr) {
            if (a > avg) count++;
        }
        System.out.println("No. of elements greater than avg " + avg + " are : " + count);
    }
}
