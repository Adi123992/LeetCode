package LogicBuilding.Phase1_Conditional.MathsAndNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DistinctDigits {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a 3 digit number");
        int num = s.nextInt();
        int d1 = num % 10;
        int d2 = (num / 10) % 10;
        int d3 = (num / 100);
        if ((d1 == d2) || (d1 == d3) || (d2 == d3)) System.out.println("Not distinct");
        else System.out.println("Distinct");
    }
}
