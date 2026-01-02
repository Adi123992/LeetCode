package LogicBuilding.Phase3_Recursion.Pattern_Printing;

import java.util.Scanner;

public class TriangleStar {
    //TC: O(n2)
    //SC: O(n)
    public static void triangle(int n, int size) {
        if (n == 0) return;
        //my approach : for (int i = n; i <= size; i++)
        //improvised below:
        for (int i = 1; i <= size - n + 1; i++) {
            System.out.print("* ");
        }
        System.out.println();
        triangle(n - 1, size);
    }

    public static void reverseTriangle(int n) {
        if (n == 0) return;
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        reverseTriangle(n - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Triangle Pattern");
        triangle(n, n);
        System.out.println("Reversed Triangle Pattern");
        reverseTriangle(n);
    }
}
