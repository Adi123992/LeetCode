package LogicBuilding.Phase4_Arrays.Manipulation;

import java.util.Scanner;

public class SquareElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < size; i++) {
            arr[i] *= arr[i];
        }
        System.out.println("Squared array is : ");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
