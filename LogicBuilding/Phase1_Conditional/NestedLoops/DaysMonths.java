package LogicBuilding.Phase1_Conditional.NestedLoops;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DaysMonths {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<Integer, Integer> months = new HashMap<>();
        months.put(1, 31);
        months.put(2, 28);
        months.put(3, 31);
        months.put(4, 30);
        months.put(5, 31);
        months.put(6, 30);
        months.put(7, 31);
        months.put(8, 31);
        months.put(9, 30);
        months.put(10, 31);
        months.put(11, 30);
        months.put(12, 31);

        int m = s.nextByte();
        System.out.println(m + "th month has " + months.get(m) + " days.");
    }
}
