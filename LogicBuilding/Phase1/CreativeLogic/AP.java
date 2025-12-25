package LogicBuilding.Phase1.CreativeLogic;

import java.util.Arrays;
import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] series = new int[5];
        for (int i = 0; i < series.length; i++) {
            series[i] = s.nextInt();
        }
        int d = series[1] - series[0];
        int count = 0;
        for (int i = 1; i < series.length; i++) {
            if (series[i] - series[i - 1] == d) {
                count++;
            }
        }
        if (count == series.length - 1)
            System.out.println("The series " + Arrays.toString(series) + " is in AP");
        else
            System.out.println("The series " + Arrays.toString(series) + " is not in AP");
    }
}
