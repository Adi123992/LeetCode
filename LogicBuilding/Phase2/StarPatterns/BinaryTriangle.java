package LogicBuilding.Phase2.StarPatterns;

import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 1;
        //take int value inside the inner loop and do
        //int value = (i+j)% 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count % 2 + " ");
                count++;
            }
            System.out.println();
        }
    }
}
