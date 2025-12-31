package LogicBuilding.Phase2_Loops_Patterns.StarPatterns;

import java.util.Scanner;

public class NumberTriangle3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //row
        int count = 1;
        for (int i = 0; i < n; i++) {
            //elements in each row
            for (int j = 0; j <= i; j++) {
                System.out.print((count++) + " ");
            }
            System.out.println();
        }
    }
}
