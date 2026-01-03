package LogicBuilding.Phase3_Recursion.Pattern_Printing;

import java.util.Scanner;

public class IncrDecrNum {
    public static void printNum(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        //it is the merge of both printing in asc and desc order
        System.out.print(n + " ");
        printNum(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printNum(n);
    }
}
