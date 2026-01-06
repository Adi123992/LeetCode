package LogicBuilding.Phase4_Arrays.Searching_Counting;

import java.util.Scanner;

public class FirstLastOccurence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int n = s.nextInt();
        for (int i = 0; i < size; i++) {
            if (arr[i] == n) {
                System.out.println("The first occurence of " + n + " is at index : " + i);
                break;
            }
        }
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] == n) {
                System.out.println("The last occurence of " + n + " is at index : " + i);
                break;
            }

        }
    }
}
