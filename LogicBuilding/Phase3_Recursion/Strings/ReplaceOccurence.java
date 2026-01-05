package LogicBuilding.Phase3_Recursion.Strings;

import java.util.Scanner;

public class ReplaceOccurence {
    public static String replace(String s, int index, StringBuilder res) {
        if (index == s.length()) {
            return res.toString();
        }
        char ch = s.charAt(index);
        if (ch == 'a') {
            return replace(s, index + 1, res.append('x'));
        }
        return replace(s, index + 1, res.append(ch));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        StringBuilder sb = new StringBuilder();
        System.out.println(replace(a, 0, sb));
    }
}
