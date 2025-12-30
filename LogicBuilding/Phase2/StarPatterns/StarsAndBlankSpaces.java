package LogicBuilding.Phase2.StarPatterns;

import java.util.Scanner;

public class StarsAndBlankSpaces {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            //print blank spaces till the penultimate element
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("b ");
            }
            //in same row printing the rest pattern
            for (int k = 1; k <= 2 * i + 1; k++) {
                if (k % 2 == 0)
                    System.out.print("b ");
                else System.out.print("* ");
            }
            System.out.println();
        }
    }
}
