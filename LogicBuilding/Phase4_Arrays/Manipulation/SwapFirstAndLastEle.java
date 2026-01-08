package LogicBuilding.Phase4_Arrays.Manipulation;

import java.util.Scanner;

public class SwapFirstAndLastEle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int temp = arr[0];
        arr[0] = arr[size - 1];
        arr[size - 1] = temp;
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
