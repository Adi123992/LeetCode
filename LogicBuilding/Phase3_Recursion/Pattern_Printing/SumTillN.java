package LogicBuilding.Phase3_Recursion.Pattern_Printing;

import java.util.Scanner;

public class SumTillN {
    public static void sumN(int n, int size, int sum) {
        if (n == 0) return;
        sum = sum + size - n + 1;
        System.out.print(sum + " ");
        sumN(n - 1, size, sum);

    }

    public static int sumN2(int n) {
        if (n == 0) return 0;
        int current = sumN2(n - 1) + n;
        System.out.print(current + " ");
        //after the deepest recursion call the current variable is shared to all the stacked recursion call
        return current;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        sumN(n, n, 0);
        System.out.println();
        sumN2(n);
    }
}
