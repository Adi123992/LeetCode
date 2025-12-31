package LogicBuilding.Phase1_Conditional.CreativeLogic;

import java.util.Scanner;

public class DigitSum1and3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int d1 = num % 10;
        int d2 = (num / 10) % 10;
        int d3 = num / 100;
        if (d1 + d3 == d2) System.out.println("The sum of " + d3 + " and " + d1 + " is equal to " + d2);
        else System.out.println("The sum of " + d1 + " and " + d3 + " is not equal to " + d2);
    }
}
