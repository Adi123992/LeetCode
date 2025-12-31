package LogicBuilding.Phase3_Recursion.Foundation;

import java.util.Scanner;

public class PowerOfNum {
    public static int power(int x, int p) {
        //Time complexity : O(p) & Space complexity : O(p) call stack space
        //base codition
        if (p == 0) {
            return 1;
        }
        return x * power(x, p - 1);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int p = s.nextInt();
        System.out.println(x + " to power " + p + " is : " + power(x, p));

    }
}
