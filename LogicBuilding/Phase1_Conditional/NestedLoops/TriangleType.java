package LogicBuilding.Phase1_Conditional.NestedLoops;

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Invalid Triangle");
        } else {
            System.out.println("Valid Triangle");
            if (a == b && b == c)
                System.out.println("Equilateral Triangle");
            else if (a == b || b == c || c == a)
                System.out.println("Isosceles Triangle");
            else
                System.out.println("Scalene Triangle");
        }
    }
}
