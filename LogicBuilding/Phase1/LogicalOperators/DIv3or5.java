package LogicBuilding.Phase1.LogicalOperators;

import java.util.Scanner;

public class DIv3or5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a % 3 == 0) {
            if (a % 5 == 0) System.out.println("FizzBuzz");
            else System.out.println("Fizz");
        } else if (a % 5 == 0) System.out.println("Buzz");
        else System.out.println("Not divisible");
    }
}
