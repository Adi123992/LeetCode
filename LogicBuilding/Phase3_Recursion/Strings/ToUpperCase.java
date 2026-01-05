package LogicBuilding.Phase3_Recursion.Strings;

import java.util.Scanner;

public class ToUpperCase {
    //TC & SC : O(n) n : length of string
    public static String upperCase(String s, int index, StringBuilder res) {
        if (index == s.length()) {
            return res.toString();
        }
        char ch = Character.toUpperCase(s.charAt(index));
        return upperCase(s, index + 1, res.append(ch));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(upperCase(s, 0, new StringBuilder()));
    }
}
