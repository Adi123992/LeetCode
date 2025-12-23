package LogicBuilding.Phase1.Simple;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int temp = s.nextInt();
        if (temp < 20) System.out.println("Cold");
        else if (temp < 40) System.out.println("Warm");
        else System.out.println("Hot");
    }
}
