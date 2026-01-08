package LogicBuilding.Phase4_Arrays.Manipulation;

import java.util.Scanner;

public class RotateArrayToRight {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int rotateBy = s.nextInt();
        int last = arr[size - 1];
        for (int i = size - 1; i >= 0; i--) {
            if (i - 1 < 0) break;
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
