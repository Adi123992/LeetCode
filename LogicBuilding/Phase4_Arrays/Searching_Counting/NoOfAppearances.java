package LogicBuilding.Phase4_Arrays.Searching_Counting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NoOfAppearances {
    public static int count(int[] arr, int index, int n) {
        if (index == arr.length) return 0;
        if (n == arr[index]) return 1 + count(arr, index + 1, n);
        else return count(arr, index + 1, n);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(10);
        }
        int n = s.nextInt();
        System.out.println("No.of appearances of " + n + " in the array " + Arrays.toString(arr) + " is : " + count(arr, 0, n));

    }
}
