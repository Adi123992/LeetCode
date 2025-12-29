package LogicBuilding.Phase2.StarPatterns;

import java.util.Scanner;

public class EvenStarsPattern {
    public static void m1(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");

                }
            } else continue;

            System.out.println();
        }
    }

    public static void m2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 2 * i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        m1(n);
        System.out.println();
        m2(n);
    }
}
