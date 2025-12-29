package LogicBuilding.Phase2.StarPatterns;

import java.util.Scanner;

public class NumberTriangle2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //row
        for (int i = 0; i < n; i++) {
            //elements in each row
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
    }
}
