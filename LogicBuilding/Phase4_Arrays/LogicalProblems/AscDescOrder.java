package LogicBuilding.Phase4_Arrays.LogicalProblems;

import java.util.Arrays;
import java.util.Scanner;

public class AscDescOrder {
    public static boolean ascOrder(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) return false;
        }
        return true;
    }

    public static boolean descOrder(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] < a[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Is arr " + Arrays.toString(arr) + " in ascending order : " + ascOrder(arr));
        System.out.println("Is arr " + Arrays.toString(arr) + " in descending order : " + descOrder(arr));

    }
}
