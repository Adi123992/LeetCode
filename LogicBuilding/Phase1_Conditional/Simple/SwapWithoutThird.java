package LogicBuilding.Phase1_Conditional.Simple;

import java.util.Scanner;

public class SwapWithoutThird {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        a = b + a;
        b = a - b;
        a = a - b;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
