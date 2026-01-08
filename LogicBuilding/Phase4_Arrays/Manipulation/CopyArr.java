package LogicBuilding.Phase4_Arrays.Manipulation;

import java.util.Scanner;

public class CopyArr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int[] newArr = new int[size];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        for (int a : newArr) {
            System.out.print(a + " ");
        }
    }
}
