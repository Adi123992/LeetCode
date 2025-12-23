package LogicBuilding.Phase1.NestedLoops;

import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a + b > c && b + c > a && a + c > b) System.out.println("Valid Triangle");
        else System.out.println("Invalid triangle");
    }
}
