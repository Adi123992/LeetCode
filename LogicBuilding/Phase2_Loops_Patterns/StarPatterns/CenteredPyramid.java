package LogicBuilding.Phase2_Loops_Patterns.StarPatterns;

import java.util.Scanner;

public class CenteredPyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            //leave blank spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            //print odd number of stars becoz by observing the pattern we saw that it is similar to right alligned traingle but with odd number of stars in it and not just the (n - blank space) stars.
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("* ");
            }
            //new row
            System.out.println();
        }
    }
}
