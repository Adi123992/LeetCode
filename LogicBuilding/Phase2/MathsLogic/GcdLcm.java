package LogicBuilding.Phase2.MathsLogic;

import java.util.Scanner;

public class GcdLcm {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int rem = b % a;
            a = b;
            b = rem;
            //gcd(a,b) = gcd(b, b % a);
        }
        return a;
    }

    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs(a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("GCD of " + a + " and " + b + " is :" + gcd(a, b));
        System.out.println("LCM of " + a + " and " + b + " is :" + lcm(a, b));

    }
}
