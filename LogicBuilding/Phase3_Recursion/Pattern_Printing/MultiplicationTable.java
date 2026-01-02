package LogicBuilding.Phase3_Recursion.Pattern_Printing;

import java.util.Scanner;

public class MultiplicationTable {
    //TC: for stop = 20 O(20) i.e. O(1)
    //SC: similarly O(20) = O(1)
    public static void table(int n, int i, int stop) {
        if (i == stop + 1) return;
        System.out.println(n + " * " + i + " = " + n * i);
        table(n, i + 1, stop);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        table(n, 1, 20);
    }
}
