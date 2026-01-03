package LogicBuilding.Phase3_Recursion.Pattern_Printing;

import java.util.Scanner;

public class LetterTriangle {
    //TC: O(n2)
    //SC: O(n) recursion stack
    public static void triangle(int n, int size) {
        if (n == 0) return;
        char ch = 'A';
        for (int i = 0; i < size - n + 1; i++) {
            System.out.print(ch + " ");
            ch++;
        }
        System.out.println();
        triangle(n - 1, size);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        triangle(n, n);
    }
}
