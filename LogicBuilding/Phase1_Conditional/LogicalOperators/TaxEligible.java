package LogicBuilding.Phase1_Conditional.LogicalOperators;

import java.util.Scanner;

public class TaxEligible {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        int salary = s.nextInt();
        if (age < 18 || salary < 0) {
            System.out.println("Invalid credentials ");
            return;
        }
        if (age > 18 && salary > 5) System.out.println("Eligible to pay tax");
        else System.out.println("Ineligible to pay tax");
    }
}
