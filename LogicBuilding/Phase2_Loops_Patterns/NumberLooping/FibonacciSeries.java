package LogicBuilding.Phase2_Loops_Patterns.NumberLooping;

import java.util.Scanner;

public class FibonacciSeries {
    public static void fiboSeries(int n) {
        if (n <= 0) return;
        if (n == 1) {
            System.out.print("0");
            return;
        }
        int a = 0, b = 1;
        int next;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            next = a + b;
            a = b;
            b = next;
            System.out.print(next + " ");
        }
    }

    public static int fiboSum(int n) {
        if (n <= 0) return -1;
        if (n == 1) {
            return 0;
        }
        int a = 0, b = 1;
        int next;
        int sum = a + b;
        for (int i = 2; i < n; i++) {
            next = a + b;
            sum += next;
            a = b;
            b = next;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("The Fibonacci series is : ");
        fiboSeries(n);
        System.out.println();
        System.out.println("The sum of Fibonacci series till " + n + " iteration is : " + fiboSum(n));
    }
}
