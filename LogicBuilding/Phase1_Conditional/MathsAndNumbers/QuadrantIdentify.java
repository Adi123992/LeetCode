package LogicBuilding.Phase1_Conditional.MathsAndNumbers;

import java.util.Scanner;

public class QuadrantIdentify {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        if (x >= 0 && y >= 0) System.out.println("First Quadrant");
        else if (x < 0 && y > 0) System.out.println("Second Quadrant");
        else if (x < 0 && y < 0) System.out.println("Third Quadrant");
        else if (x > 0 && y < 0) System.out.println("Fourth Quadrant");
    }
}
