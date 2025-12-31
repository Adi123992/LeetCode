package LogicBuilding.Phase1_Conditional.CreativeLogic;

import java.util.Arrays;
import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] series = new int[5];
        for (int i = 0; i < series.length; i++) {
            series[i] = s.nextInt();
        }
        double ratio = (double) series[1] / series[0];
        int count = 0;
        for (int i = 1; i < series.length; i++) {
            if ((double) series[i] / series[i - 1] == ratio) {
                count++;
            }
        }
        if (count == series.length - 1)
            System.out.println("The series " + Arrays.toString(series) + " is in GP");
        else
            System.out.println("The series " + Arrays.toString(series) + " is not in GP");
        System.out.println("===========================================");
        System.out.println("Via method 2 : ");
        method2(series);
    }

    public static void method2(int[] series) {
        boolean isGP = true;
        // to avoid zero divisions and more mathematically correct
        for (int i = 1; i < series.length - 1; i++) {
            if (series[i] * series[i] != series[i - 1] * series[i + 1]) {
                isGP = false;
                break;
            }
        }

        if (isGP)
            System.out.println("The series " + Arrays.toString(series) + " is in GP");
        else
            System.out.println("The series " + Arrays.toString(series) + " is not in GP");

    }
}
