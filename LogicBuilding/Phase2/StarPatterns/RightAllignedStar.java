package LogicBuilding.Phase2.StarPatterns;

import java.util.Scanner;

public class RightAllignedStar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
