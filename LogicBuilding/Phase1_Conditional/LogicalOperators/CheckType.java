package LogicBuilding.Phase1_Conditional.LogicalOperators;

import java.util.Scanner;

public class CheckType {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        int countd = 0, countl = 0, random = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (Character.isAlphabetic(ch)) countl++;
            else if (Character.isDigit(ch)) countd++;
            else random++;
        }
        System.out.println("No. of digits : " + countd);
        System.out.println("No. of letters : " + countl);
        System.out.println("Random : " + random);
    }
}
