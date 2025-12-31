package LogicBuilding.Phase1_Conditional.LogicalOperators;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hr = s.nextByte();
        int min = s.nextByte();
        if ((hr >= 24 || hr < 0) || (min >= 60 || min < 0)) {
            System.out.println("Invalid time entered");
            return;
        }
//        if ((hr < 12 && min > 0) || (hr == 12 && min == 0)) System.out.println("AM");
//        else if ((hr > 12 && min > 0) || (hr == 23 && min == 0)) System.out.println("PM");
        if (hr < 12) System.out.println("AM");
        else System.out.println("PM");

    }
}
