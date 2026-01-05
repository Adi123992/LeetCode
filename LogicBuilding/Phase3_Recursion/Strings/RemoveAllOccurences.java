package LogicBuilding.Phase3_Recursion.Strings;

import java.util.Scanner;

public class RemoveAllOccurences {
    //TC & SC: O(n) n: length of string
    public static String removeAllOccurences(String s, int index, StringBuilder res) {
        if (index == s.length()) {
            return res.toString();
        }
        char ch = s.charAt(index);
        if (ch == 'a' || ch == 'A') {
            return removeAllOccurences(s, index + 1, res);
        }
        return removeAllOccurences(s, index + 1, res.append(ch));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("After removing all the occurences of letter 'A/a' from " + s + " we get : ");
        StringBuilder sb = new StringBuilder();
        System.out.println(removeAllOccurences(s, 0, sb));
    }
}
