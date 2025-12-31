package LogicBuilding.Phase1_Conditional.CreativeLogic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidDate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int date = s.nextInt();
        int month = s.nextInt();
        Map<Integer, Integer> dates = new HashMap<>();
        dates.put(1, 31);
        dates.put(2, 28);
        dates.put(3, 31);
        dates.put(4, 30);
        dates.put(5, 31);
        dates.put(6, 30);
        dates.put(7, 31);
        dates.put(8, 31);
        dates.put(9, 30);
        dates.put(10, 31);
        dates.put(11, 30);
        dates.put(12, 31);
        if (month > 12 || month < 1) {
            System.out.println("Invalid month");
            return;
        }
        if (date > 0 && date <= dates.get(month)) System.out.println(date + "/" + month + " is a valid date");
        else System.out.println("It is not a valid date");
    }
}
