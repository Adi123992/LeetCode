package LogicBuilding.Phase3_Recursion.Foundation;

import java.util.Scanner;

public class PrintNos {
    public static void printNos(int n) {
        //base condition
        if (n == 0) return;
        printNos(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printNos(n);
    }
}
