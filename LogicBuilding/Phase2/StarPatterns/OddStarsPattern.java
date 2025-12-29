package LogicBuilding.Phase2.StarPatterns;

import java.util.Scanner;

public class OddStarsPattern {
    public static void m1(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");

                }
            } else continue;

            System.out.println();
        }
    }

    public static void m2(int n) {
        //the value assigned to i should be considered beside how are we going to print the star pattern
        for (int i = 0; i < n; i++) {
            //think of it for the first iteration as if you just want to print only 1 star at start so what condition you would apply to get only 1
            for (int j = 0; j < 2 * i + 1; j++) {
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
