package LogicBuilding.Phase4_Arrays.Basic;

import java.util.Scanner;

public class MaxMinIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int maxi = maxIndex(arr);
        int mini = minIndex(arr);
        System.out.println("Maximum index : " + maxi);
        System.out.println("Minimum index : " + mini);
    }

    private static int minIndex(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
    }

    private static int maxIndex(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
