package LogicBuilding.Phase2.LogicalLoops;

import java.util.Scanner;

public class SumOfNonZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any 5 non zero numbers : ");
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int x = s.nextInt();
            if (x == 0) continue;
            sum += x;
        }
        System.out.println("The sum of non zero numbers is : " + sum);
    }
}
