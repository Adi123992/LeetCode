package LogicBuilding.Phase3_Recursion.Foundation;

import java.util.Scanner;

public class OddEvenNumbers {
    public static void evenPrint(int n) {
        if (n == 0) {
            System.out.print("0 ");
            return;
        }
        if (n % 2 == 0) {
            evenPrint(n - 2);
            System.out.print(n + " ");
        } else evenPrint(n - 1);

    }

    public static void evenPrint2(int n) {
        if (n < 0) return;   // safe base case

        if (n % 2 != 0)
            evenPrint(n - 1);
        else {
            evenPrint(n - 2);
            System.out.print(n + " ");
        }
    }

    public static void oddPrint(int n) {
        if (n < 0) return;   // safe base case
        if (n % 2 != 0) {
            oddPrint(n - 2);
            System.out.print(n + " ");
        } else {
            oddPrint(n - 1);
        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        evenPrint(n);
        System.out.println();
        evenPrint2(n);
        System.out.println();
        oddPrint(n);

    }
}
