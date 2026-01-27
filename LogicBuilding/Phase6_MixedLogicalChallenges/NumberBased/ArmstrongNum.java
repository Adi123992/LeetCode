package LogicBuilding.Phase6_MixedLogicalChallenges.NumberBased;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int temp = num;
        int digits = (int) Math.log10(num) + 1;
        System.out.println(digits);
        int armstrong = 0;
        while (num != 0) {
            int rem = num % 10;
            armstrong += (int) Math.pow(rem, digits);
            num /= 10;
        }
        System.out.println("Armstrong num of " + temp + " is : " + armstrong);
    }
}
