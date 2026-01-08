package LogicBuilding.Phase4_Arrays.Manipulation;

import java.util.Scanner;

public class EvenOddReplace {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
