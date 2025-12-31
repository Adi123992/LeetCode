package LogicBuilding.Phase1_Conditional.MathsAndNumbers;

import java.util.Scanner;

public class ThirdAngle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a1 = s.nextInt();
        int a2 = s.nextInt();
        int a3 = 180 - (a1 + a2);
        System.out.println("Angles : " + a1 + ", " + a2 + ", " + a3);

    }
}
