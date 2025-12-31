package LogicBuilding.Phase1_Conditional.MathsAndNumbers;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int temp = num;
        int count = 0;
        if (num == 0) {
            count++;
        }
        while (num != 0) {
            count++;
            num = num / 10;
        }
        System.out.println("No. of digits in " + temp + " is : " + count);
    }
}
