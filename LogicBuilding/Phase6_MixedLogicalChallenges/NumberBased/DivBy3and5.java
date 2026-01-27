package LogicBuilding.Phase6_MixedLogicalChallenges.NumberBased;

import java.util.Scanner;

public class DivBy3and5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Count : " + count);
    }
}
