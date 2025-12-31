package LogicBuilding.Phase2_Loops_Patterns.StarPatterns;

import java.util.Scanner;

public class NumberTriangle4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 1;
        //row
        for (int i = 0; i < n; i++) {
            //elements in each row
            for (int j = 0; j <= i; j++) {
                System.out.print((count % 10) + " ");
                count++;
            }
            System.out.println();
        }
    }
}
