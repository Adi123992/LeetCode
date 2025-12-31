package LogicBuilding.Phase2_Loops_Patterns.NumberLooping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectNumber {
    public static void perfectNum(int num) {
        List<Integer> l = new ArrayList<>();
        if (num <= 1) {
            System.out.println("Not a perfect no.");
            return;
        }
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) l.add(i);
        }
        int sum = 0;
        for (int a : l) {
            sum += a;
        }
        if (sum == num) System.out.println(num + " is a Perfect Number.");
        else System.out.println(num + " is not a Perfect Number.");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        perfectNum(num);
    }
}
