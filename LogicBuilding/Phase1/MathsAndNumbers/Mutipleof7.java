package LogicBuilding.Phase1.MathsAndNumbers;

import java.util.Scanner;

public class Mutipleof7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String res = (num % 7 == 0 || num % 10 == 7) ? "Valid " : "Invalid";
        System.out.println(res);
    }
}
