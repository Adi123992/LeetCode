package LogicBuilding.Phase4_Arrays.Searching_Counting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ElementExist {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(10);
        }
        int n = s.nextInt();
        for (int a : arr) {
            if (a == n) {
                System.out.println("Element " + n + " exists in the arr " + Arrays.toString(arr));
                return;
            }
        }
        System.out.println("Element " + n + " doesnt exist in the arr " + Arrays.toString(arr));
    }
}
