package LogicBuilding.Phase3_Recursion.Number_Based;

import java.util.Scanner;

public class HCF {
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("HCF/GCD of " + a + " and " + b + " is : " + gcd(a, b));
        System.out.println("LCM of " + a + " and " + b + " is : " + lcm(a, b));
    }
}
