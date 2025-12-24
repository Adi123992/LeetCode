package LogicBuilding.Phase1.MathsAndNumbers;

import java.util.Scanner;

public class AmountCurrency {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int amount = s.nextInt();

        //method 1
        valid1(amount);
        //method 2
        valid2(amount);
    }

    private static void valid2(int amount) {
        if (amount % 100 != 0) {
            System.out.println("The amount cannot be evenly divided");
            return;
        }
        int twoh = amount / 2000;
        amount = amount % 2000;

        int fiveh = amount / 500;
        amount = amount % 500;

        int hund = amount / 100;
        amount = amount % 100;
        System.out.println("The amount can be evenly divided within currency");
        System.out.println(" 2000Rs Notes : " + twoh);
        System.out.println(" 500Rs Notes : " + fiveh);
        System.out.println(" 100Rs Notes :" + hund);

    }

    public static void valid1(int amount) {
        int twoh = 0, fiveh = 0, hundred = 0;
        while (amount >= 2000) {
            twoh++;
            amount -= 2000;
        }
        while (amount >= 500) {
            fiveh++;
            amount -= 500;
        }
        while (amount >= 100) {
            hundred++;
            amount -= 100;
        }
        if (amount != 0) {
            System.out.println("The amount cannot be evenly divided within these currency");
        } else {
            System.out.println("The amount can be evenly divided within currency");
            System.out.println(" 2000Rs Notes : " + twoh);
            System.out.println(" 500Rs Notes : " + fiveh);
            System.out.println(" 100Rs Notes :" + hundred);
        }
    }
}
