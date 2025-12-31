package LogicBuilding.Phase1_Conditional.CreativeLogic;

import java.util.Scanner;

public class CenturyAssign {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        int century;
        if (year % 100 == 0) {
            century = year / 100;
        } else century = (year / 100) + 1;
        System.out.println(year + " comes in " + century + " century.");
    }
}
