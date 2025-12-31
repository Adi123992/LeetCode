package LogicBuilding.Phase2_Loops_Patterns.MathsLogic;

import java.util.Scanner;

public class FactorsAndSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sum = 0;
        System.out.print("The factors of " + num + " are : ");
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println();
        System.out.println("The sum of factors of " + num + " is : " + sum);

    }
}
