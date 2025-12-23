package LogicBuilding.Phase1.NestedLoops;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if (a % b == 0) System.out.println(a + " is multiple of " + b);
        else if (b % a == 0) System.out.println(b + " is multiple of " + a);
        else System.out.println("None is multiple of each other");
    }
}
