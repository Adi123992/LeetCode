package LogicBuilding.Phase4_Arrays.Basic;

import java.util.Scanner;

public class GreaterThanK {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter value k : ");
        int k = s.nextInt();
        for (int a : arr) {
            if (a > k) System.out.print(a + " ");
        }
    }
}
