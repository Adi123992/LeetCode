package LogicBuilding.Phase1_Conditional.MathsAndNumbers;

import java.util.Scanner;

public class MiddleDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int d1 = num % 10;
        int d2 = (num / 10) % 10;
        int d3 = num / 100;
        if (d2 > d1 && d2 > d3) System.out.println("Largest");
        else if (d2 < d1 && d2 < d3) System.out.println("Smallest");
        else System.out.println("Neither");
    }
}
