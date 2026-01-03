package LogicBuilding.Phase3_Recursion.Strings;

import java.util.Scanner;

public class ReverseString {
    //brute force approach
    public static String reverse(String s, StringBuilder snew) {
        for (int i = s.length() - 1; i >= 0; i--) {
            char a = s.charAt(i);
            snew.append(a);
        }
        return String.valueOf(snew);
    }

    //recursive appraoch
    //TC: o(n2)
    //SC: O(n) recursive stack
    public static String reverse2(String s) {
        if (s.length() == 1) return s;
        return s.charAt(s.length() - 1) + reverse2(s.substring(0, s.length() - 1));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String t = s.next();
        StringBuilder sb = new StringBuilder();
        System.out.println("Brute Force : Reverse of " + t + " is : " + reverse(t, sb));
        System.out.println("Recursive : Reverse of " + t + " is : " + reverse2(t));

    }
}
