package LogicBuilding.Phase1_Conditional.Simple;

import java.util.Scanner;

public class Max2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int max = (n1 > n2) ? n1 : n2;
        System.out.println("Max : " + max);
        //Alternate method
        int max2 = Math.max(n1, n2);
        System.out.println("Max : " + max2);

    }
}
