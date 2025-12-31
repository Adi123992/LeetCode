package LogicBuilding.Phase2_Loops_Patterns.BasicLoops;

import java.util.Scanner;

public class SumOfEON {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sumn = 0, sume = 0, sumo = 0;
        System.out.print("Sum of Natural Numbers : ");
        for (int i = 1; i <= n; i++) {
            sumn += i;
        }
        System.out.println(sumn);
        System.out.print("Sum of Even Numbers : ");
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) sume += i;
        }
        System.out.println(sume);
        System.out.print("Sum of Odd Numbers : ");
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) sumo += i;
        }
        System.out.println(sumo);
    }
}
