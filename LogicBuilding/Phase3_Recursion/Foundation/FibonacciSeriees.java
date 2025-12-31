package LogicBuilding.Phase3_Recursion.Foundation;

import java.util.Scanner;

public class FibonacciSeriees {
    public static int fibo(int n) {
        //base conditions
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
}
