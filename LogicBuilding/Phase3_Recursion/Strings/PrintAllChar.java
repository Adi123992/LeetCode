package LogicBuilding.Phase3_Recursion.Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllChar {
    public static void printAllChar(String s, int index) {
        if (index == s.length()) {
            return;
        }
        char ch = s.charAt(index);
        System.out.print(ch + " ");
        printAllChar(s, index + 1);
    }

    public static ArrayList<Character> printAllChar2(String s, int index, ArrayList<Character> chars) {
        if (index == s.length() - 1) {
            chars.add(s.charAt(index));
            return chars;
        }
        char ch = s.charAt(index);
        chars.add(ch);
        return printAllChar2(s, index + 1, chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printAllChar(s, 0);
        System.out.println();
        System.out.println("Or via the arraylist metod : ");
        ArrayList<Character> list = printAllChar2(s, 0, new ArrayList<>());
        System.out.println(list);
    }
}
