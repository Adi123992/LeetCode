package LogicBuilding.Phase2.LogicalLoops;

import java.util.Scanner;

public class EvenDigitsSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //in range 0-100
        if (n > 100 || n < 0) {
            System.out.println("Invalid range . Enter in range 0 - 100");
            return;
        }
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int temp = i;
            while (temp != 0) {
                int rem = temp % 10;
                sum += rem;
                temp /= 10;
            }
            if (sum % 2 == 0) System.out.print(i + " ");
        }

    }
}
