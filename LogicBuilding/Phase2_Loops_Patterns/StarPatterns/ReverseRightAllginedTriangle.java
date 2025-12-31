package LogicBuilding.Phase2_Loops_Patterns.StarPatterns;

import java.util.Scanner;

public class ReverseRightAllginedTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //start from the highest row number
        for (int i = n - 1; i >= 0; i--) {
            //print blank spaces where required in the left sub part
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            //print stars in the right sub part
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
