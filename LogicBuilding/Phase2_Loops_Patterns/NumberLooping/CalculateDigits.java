package LogicBuilding.Phase2_Loops_Patterns.NumberLooping;

import java.util.Scanner;

public class CalculateDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int temp = num;
        int count = 0;
        if (num == 0) count++;
        while (num != 0) {
            count++;
            num /= 10;
        }
        System.out.println("Number of digits in " + temp + " is : " + count);
    }
}
