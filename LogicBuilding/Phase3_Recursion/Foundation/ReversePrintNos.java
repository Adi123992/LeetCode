package LogicBuilding.Phase3_Recursion.Foundation;

import java.util.Scanner;

public class ReversePrintNos {
    public static void printNos(int n) {
        //base condition
        if (n == 0) return;
        System.out.print(n + " ");
        printNos(n - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printNos(n);
    }
}
