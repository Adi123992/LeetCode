package LogicBuilding.Phase1_Conditional.CreativeLogic;

import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num > 9999 || num < 1) {
            System.out.println("Invalid range number entered.");
            return;
        }
        int temp = num;
        int sum = 0;
        int prod = 1;
        while (num != 0) {
            int rem = num % 10;
            sum += rem;
            prod *= rem;
            num /= 10;
        }
        if (sum == prod) System.out.println("The sum and product of " + temp + " is equal .");
        else System.out.println("The sum and product of " + temp + " is not equal .");
    }
}
