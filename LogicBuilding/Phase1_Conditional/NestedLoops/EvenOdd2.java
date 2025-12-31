package LogicBuilding.Phase1_Conditional.NestedLoops;

import java.util.Scanner;

public class EvenOdd2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if ((a % 2 == 0) && (b % 2 == 0)) System.out.println("Both are even");
        else if ((a % 2 == 0) && (b % 2 != 0)) System.out.println(a + " is even " + b + " is odd");
        else if ((a % 2 != 0) && (b % 2 == 0)) System.out.println(b + " is even " + a + " is odd");
        else System.out.println("Both are odd");
    }
}
