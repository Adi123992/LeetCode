package LogicBuilding.Phase1_Conditional.CreativeLogic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//take 2 dates and identify which date comes first in calendar
public class WhichDateFirst {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
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
        int[] date1 = new int[2];
        int[] date2 = new int[2];
        for (int i = 0; i < date1.length; i++) {
            date1[i] = s.nextInt();
            date2[i] = s.nextInt();
        }
        if (!dates.containsKey(date1[1]) || !dates.containsKey(date2[1])) {
            System.out.println("Invalid date entered");
            return;
        }
        if (date1[0] < 1 || date2[0] < 1 || date1[0] > dates.get(date1[1]) || date2[0] > dates.get(date2[1])) {
            System.out.println("Invalid date entered");
            return;
        }
        if (date1[0] == date2[0] && date1[1] == date2[1]) {
            System.out.println("Both dates are the same");
            return;
        }
        if (date2[1] > date1[1]) {
            System.out.println("Date " + date1[0] + "/" + date1[1] + " comes first in calendar");
        } else if (date1[1] > date2[1]) {
            System.out.println("Date " + date2[0] + "/" + date2[1] + " comes first in calendar");
        } else {
            if (date1[0] > date2[0])
                System.out.println("Date " + date2[0] + "/" + date2[1] + " comes first in calendar");
            else
                System.out.println("Date " + date1[0] + "/" + date1[1] + " comes first in calendar");
        }

    }
}
