package LogicBuilding.Phase1.Simple;

import java.util.Scanner;

public class CheckChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') System.out.println("Uppercase");
            else if (ch >= 'a' && ch <= 'z') System.out.println("Lowercase");
            else System.out.println("Other");
        }
        System.out.println("============================");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) System.out.println("Uppercase");
            else if (Character.isLowerCase(ch)) System.out.println("Lowercase");
            else System.out.println("Other");
        }
    }
}
