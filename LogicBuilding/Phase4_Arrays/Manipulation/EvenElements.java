package LogicBuilding.Phase4_Arrays.Manipulation;

import java.util.Scanner;

public class EvenElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int p = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                arr[p] = arr[i];
                p++;
            }
        }
        for (int i = 0; i < p; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
