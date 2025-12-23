package LogicBuilding.Phase1.Simple;

import java.util.Locale;
import java.util.Scanner;

public class VowelConso {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String res = a.toLowerCase(Locale.ROOT);
        int vow = 0, con = 0, other = 0, blank_space = 0;
        for (int i = 0; i < res.length(); i++) {
            char c = res.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') vow++;
            else if (c >= 'a' && c <= 'z') con++;
            else if (c == ' ') blank_space++;
            else other++;
        }
        System.out.println("Vowels : " + vow);
        System.out.println("Consonants : " + con);
        System.out.println("Other Characters : " + other);
        System.out.println("Blank Spaces : " + blank_space);
    }
}
