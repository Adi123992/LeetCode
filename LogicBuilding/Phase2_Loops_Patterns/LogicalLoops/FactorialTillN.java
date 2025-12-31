package LogicBuilding.Phase2_Loops_Patterns.LogicalLoops;

import java.util.Scanner;

public class FactorialTillN {
    public static int fact(int n) {
        if (n == 0 || n == 1) return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //time complexity : O(n2)
        for (int i = 1; i <= n; i++) {
            int f = fact(i);
            System.out.print(f + " ");
        }
        System.out.println();
        //efficient method O(n)
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            System.out.print(fact + " ");
        }
    }
}
