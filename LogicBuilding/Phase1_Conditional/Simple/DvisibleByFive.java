package LogicBuilding.Phase1_Conditional.Simple;

import java.util.Scanner;

public class DvisibleByFive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String r = (n % 5 == 0) ? "Divisible" : "Not Divisible";
        System.out.println(r);
    }
}
