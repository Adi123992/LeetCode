package LogicBuilding.Phase4_Arrays.Manipulation;

import java.util.Scanner;

//Time: O(n)
//Space: O(1)
public class ReverseArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < size / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = temp;
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
