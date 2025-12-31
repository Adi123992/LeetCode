package LogicBuilding.Phase1_Conditional.CreativeLogic;

import java.util.Scanner;

public class CoordinateCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        if ((x != 0) && (y != 0)) System.out.println("The point is (" + x + "," + y + ")");
        else if (x != 0 && y == 0) System.out.println("The point lies on x axis at " + x);
        else if (x == 0 && y != 0) System.out.println("The point lies on y axis at " + y);
        else System.out.println("It lies on origin (0,0)");
    }
}

