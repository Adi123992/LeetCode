package LogicBuilding.Phase2.MathsLogic;

import java.util.Scanner;

public class NSquaresCubes {
    public static void nsqr(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println();
    }

    public static void ncube(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i * i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Squares : ");
        nsqr(n);
        System.out.println("Cubes : ");
        ncube(n);
    }
}
