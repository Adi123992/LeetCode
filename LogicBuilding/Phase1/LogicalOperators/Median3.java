package LogicBuilding.Phase1.LogicalOperators;

import java.util.Scanner;

public class Median3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextByte();
        int b = s.nextByte();
        int c = s.nextByte();
        int median;
        if ((a >= b && a <= c) || (a >= c && a <= b)) median = a;
        else if ((b >= c && b <= a) || (b <= c && b >= a)) median = b;
        else median = c;
        System.out.println("Median : " + median);
    }
}
