package LogicBuilding.Phase4_Arrays.Basic;

import java.util.Scanner;

public class PosNegEvenOdd {
    public static void countPosNeg(int[] arr) {
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) pos++;
            else if (arr[i] == 0) zero++;
            else neg++;
        }
        System.out.println("Positive : " + pos);
        System.out.println("Negative : " + neg);
        System.out.println("Zero : " + zero);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        countPosNeg(arr);
        countEvenOdd(arr);
    }

    private static void countEvenOdd(int[] arr) {
        int even = 0;
        int odd = 0;
        for (int a : arr) {
            if (a % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even : " + even);
        System.out.println("Odd : " + odd);
    }
}
