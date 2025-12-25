package LogicBuilding.Phase2.NumberLooping;

import java.util.Scanner;

public class ArmstrongNumber {
    public static int findDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static void findArmstrong(int num, int digits) {
        int sum = 0;
        int temp = num;
        while (num != 0) {
            int rem = num % 10;
            sum = (int) (sum + Math.pow(rem, digits));
            num /= 10;
        }
        if (sum == temp) System.out.println(temp + " is an Armstrong No.");
        else System.out.println(temp + " is not an Armstrong no.");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int digits = findDigits(num);
        findArmstrong(num, digits);

    }
}
