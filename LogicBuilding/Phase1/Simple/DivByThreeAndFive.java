package LogicBuilding.Phase1.Simple;

import java.util.Scanner;

public class DivByThreeAndFive {
    public static void main(String[] args) {
        System.out.println("To check whether number divisible by both 3 and 5 or not");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        String res = ((n % 5 == 0) && (n % 3 == 0)) ? "Divisible by both" : "Not divisible by both";
        System.out.println(res);
    }
}
