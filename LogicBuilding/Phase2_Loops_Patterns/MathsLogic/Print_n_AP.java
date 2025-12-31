package LogicBuilding.Phase2_Loops_Patterns.MathsLogic;

import java.util.Scanner;

public class Print_n_AP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size : ");
        int n = s.nextInt();
        System.out.println("Enter first term : ");
        int a = s.nextInt();
        System.out.println("Enter common difference :");
        int d = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            a += d;
        }

    }
}
