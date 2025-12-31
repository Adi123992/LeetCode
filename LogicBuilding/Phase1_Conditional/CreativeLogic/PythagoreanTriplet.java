package LogicBuilding.Phase1_Conditional.CreativeLogic;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int x, y, z;

        if (a >= b && a >= c) {
            x = a;
            y = b;
            z = c;
        } else if (b >= a && b >= c) {
            x = b;
            y = c;
            z = a;
        } else {
            x = c;
            y = b;
            z = a;
        }
        if (x * x == y * y + z * z) System.out.println("It is an valid Pythagorean triplet");
        else System.out.println("It is not a valid Pythagorean triplet");
    }
}
