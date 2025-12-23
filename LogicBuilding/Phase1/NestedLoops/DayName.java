package LogicBuilding.Phase1.NestedLoops;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DayName {
    public static void main(String[] args) {
        Map<Integer, String> days = new HashMap<>();
        days.put(1, "Monday");
        days.put(2, "Tuesday");
        days.put(3, "Wednesday");
        days.put(4, "Thursday");
        days.put(5, "Friday");
        days.put(6, "Saturday");
        days.put(7, "Sunday");

        Scanner s = new Scanner(System.in);
        int day = s.nextByte();
        System.out.println(days.get(day));
    }
}
