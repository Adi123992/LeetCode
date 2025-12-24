package LogicBuilding.Phase1.MathsAndNumbers;

import java.util.Scanner;

public class FourDigitCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int first = num % 10;
        int last = num / 1000;
        if (first == last) System.out.println("First and last digits are equal");
        else System.out.println("First and last digits are not equal");
    }
}
