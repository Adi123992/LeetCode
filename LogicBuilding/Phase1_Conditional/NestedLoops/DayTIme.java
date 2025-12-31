package LogicBuilding.Phase1_Conditional.NestedLoops;

import java.util.Scanner;

public class DayTIme {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        if (t < 0 || t > 23) System.out.println("Invalid time entered.");
        else {
            if (t >= 1 && t <= 12) System.out.println("Good Morning");
            else if (t >= 13 & t <= 16) System.out.println("Good Afternoon");
            else if (t >= 17 & t <= 19) System.out.println("Good Evening");
            else System.out.println("Good Night");
        }
    }
}
