package LogicBuilding.Phase2.MathsLogic;

import java.util.Scanner;

public class Print_n_GP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size : ");
        int n = s.nextInt();
        System.out.println("Enter first term : ");
        double a = s.nextDouble();
        System.out.println("Enter common ratio :");
        double r = s.nextDouble();
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            a *= r;
        }
    }
}
