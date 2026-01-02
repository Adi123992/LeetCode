package LogicBuilding.Phase3_Recursion.Pattern_Printing;

import java.util.Scanner;

public class SquareStar {
    //TC:O(n2) n*n pattern
    //SC:O(n) recursion call stack
    public static void sqPattern(int n, int size) {
        if (n == 0) return;
        for (int i = 0; i < size; i++) {
            System.out.print("*  ");
        }
        System.out.println();
        sqPattern(n - 1, size);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        sqPattern(n, n);
    }
}
