package LogicBuilding.Phase3_Recursion.Strings;

import java.util.Scanner;

public class BlankSpaces {
    //TC & SC: O(n) n: length of string
    public static String removeBlank(String s, int index, StringBuilder res) {
        if (index == s.length()) {
            return String.valueOf(res);
        }
        char ch = s.charAt(index);
        index++;
        if (ch == ' ') {
            return removeBlank(s, index, res);
        }
        return removeBlank(s, index, res.append(ch));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        System.out.println(removeBlank(s, 0, sb));
    }
}
