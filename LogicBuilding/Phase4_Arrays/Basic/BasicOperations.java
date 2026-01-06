package LogicBuilding.Phase4_Arrays.Basic;

import java.util.Scanner;

public class BasicOperations {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        printArr(s, arr);
        sumArr(arr);
        avgArr(arr);
        maxEle(arr);
        minEle(arr);

    }

    private static void minEle(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int a : arr) {
            if (a < min) min = a;
        }
        System.out.println("The minimum value in arr is : " + min);

    }

    private static void maxEle(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int a : arr) {
            if (a > max) max = a;
        }
        System.out.println("The maximum value in arr is : " + max);
    }

    private static void avgArr(int[] arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;

        }
        float avg = (float) sum / arr.length;
        System.out.println("The average of arr is : " + avg);

    }

    private static void printArr(Scanner s, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("The Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void sumArr(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        System.out.println("The sum of all elements in arr is : " + sum);
    }
}
