package LogicBuilding.Phase4_Arrays.ComparativeThinking;

import java.util.Scanner;

public class CompArr1 {
    public static boolean compareArr(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        int[] arr2 = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < size; i++) {
            arr2[i] = s.nextInt();
        }
        boolean res = compareArr(arr, arr2);
        System.out.println("Are both arrays equal in same order ? : " + res);
    }
}
