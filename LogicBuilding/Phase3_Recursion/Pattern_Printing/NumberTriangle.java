package LogicBuilding.Phase3_Recursion.Pattern_Printing;

import java.util.Scanner;

public class NumberTriangle {
    //TC: O(n2)
    //SC: O(n)
    public static void numTri(int n, int size) {
        if (n == 0) return;
        for (int i = 1; i <= size - n + 1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        numTri(n - 1, size);
    }

    public static void revNumTri(int n) {
        if (n == 0) return;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        revNumTri(n - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Number Triangle : ");
        numTri(n, n);
        System.out.println("Reverse Number Triangle : ");
        revNumTri(n);
    }
}
