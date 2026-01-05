package LogicBuilding.Phase3_Recursion.Strings;

import java.util.Scanner;

public class VowelConsonantCount {
    public static int vowelCount(String s, int index) {
        if (index == s.length()) {
            return 0;
        }
        char ch = Character.toLowerCase(s.charAt(index));
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return 1 + vowelCount(s, index + 1);
        }
        return vowelCount(s, index + 1);
    }

    public static int consonantCount(String s, int index) {
        if (index == s.length()) {
            return 0;
        }
        char ch = Character.toLowerCase(s.charAt(index));
        if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
            return 1 + consonantCount(s, index + 1);
        }
        return consonantCount(s, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("No of vowels in " + s + " is :" + vowelCount(s, 0));
        System.out.println("No of consonants in " + s + " is :" + consonantCount(s, 0));
    }
}
