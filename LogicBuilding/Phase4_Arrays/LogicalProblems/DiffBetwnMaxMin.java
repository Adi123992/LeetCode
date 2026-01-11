package LogicBuilding.Phase4_Arrays.LogicalProblems;

import java.util.Scanner;

public class DiffBetwnMaxMin {
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
        for (int a : arr) {
            if (a > max) {
                max = a;
            }
            if (a < min) {
                min = a;
            }
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
        System.out.println("Difference between them : " + (max - min));
    }
}
