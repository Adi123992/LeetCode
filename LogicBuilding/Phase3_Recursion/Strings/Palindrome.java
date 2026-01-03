package LogicBuilding.Phase3_Recursion.Strings;

import java.util.Scanner;

public class Palindrome {
    public static String reverse(String s) {
        if (s.length() == 1) return s;
        return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
    }

    public static boolean palindrome(String s, String rev) {
        if (s.equals(rev)) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        System.out.println("Is " + s + " a palindrome : " + palindrome(s, reverse(s)));
    }
}
