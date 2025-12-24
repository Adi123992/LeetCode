package LogicBuilding.Phase1.MathsAndNumbers;

import java.util.Scanner;

public class In3dRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String res = (num >= 100 && num <= 999) ? "In range" : "Out of Range";
        System.out.println(res);
    }
}
