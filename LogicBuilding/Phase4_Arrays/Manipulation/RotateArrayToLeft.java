package LogicBuilding.Phase4_Arrays.Manipulation;

import java.util.Scanner;

public class RotateArrayToLeft {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int rotateBy = s.nextInt();
        int last = arr[0];
        for (int i = 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        arr[size - 1] = last;
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
