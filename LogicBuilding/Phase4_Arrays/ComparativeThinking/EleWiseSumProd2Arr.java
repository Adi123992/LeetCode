package LogicBuilding.Phase4_Arrays.ComparativeThinking;

import java.util.Scanner;

public class EleWiseSumProd2Arr {
    //my approach : TC O(n+k1+k2)
    public static int sumArr(int[] a1, int[] a2) {
        //int size = (a1.length > a2.length) ? a2.length : a1.length;
        int size = Math.min(a1.length, a2.length);
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += a1[i] + a2[i];
        }
        if (a1.length > a2.length) {
            int remaining = a1.length - size;
            for (int i = size; i < size + remaining; i++) {
                sum += a1[i];
            }
        } else {
            int remaining = a2.length - size;
            for (int i = size; i < size + remaining; i++) {
                sum += a2[i];
            }
        }
        return sum;
    }

    //same TC but readable and less complicated
    public static int sumArr2(int[] a1, int[] a2) {
        int sum = 0;
        int max = Math.max(a1.length, a2.length);

        for (int i = 0; i < max; i++) {
            if (i < a1.length) {
                sum += a1[i];
            }
            if (i < a2.length) {
                sum += a2[i];
            }
        }
        return sum;
    }

    public static int prodArr(int[] a1, int[] a2) {
        int prod = 1;
        int max = Math.max(a1.length, a2.length);

        for (int i = 0; i < max; i++) {
            if (i < a1.length) {
                prod *= a1[i];
            }
            if (i < a2.length) {
                prod *= a2[i];
            }
        }
        return prod;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Size of arr 1 : ");
        int size1 = s.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Size of arr 2 : ");
        int size2 = s.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < size1; i++) {
            arr1[i] = s.nextInt();
        }
        for (int i = 0; i < size2; i++) {
            arr2[i] = s.nextInt();
        }
        System.out.println(sumArr(arr1, arr2));
        System.out.println(prodArr(arr1, arr2));
    }
}
