package LogicBuilding.Phase1_Conditional.MathsAndNumbers;

import java.util.Scanner;

public class PerfectSqr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i = 0;
        while (i * i <= num) {
            if (i * i == num) {
                System.out.println("Sqrt of " + num + " is : " + i);
                return;
            }
            i++;
        }
        System.out.println(num + " isn't a perfect square");
    }
}
