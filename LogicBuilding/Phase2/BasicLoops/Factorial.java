package LogicBuilding.Phase2.BasicLoops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int prod = 1;
        for (int i = 1; i <= n; i++) {
            prod *= i;
        }
        System.out.println("Factorial of " + n + " is : " + prod);
    }
}
