package LogicBuilding.Phase3_Recursion.Strings;

import java.util.Scanner;

public class StrVowels {
    //brute force recursion
    //TC: O(n2)
    //SC: O(n2)
    public static int countVowels(String s, int count) {
        //if (s.length() == 0)
        if (s.isEmpty()) {
            return count;
        }
        char ch = s.charAt(s.length() - 1);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') count++;
        return countVowels(s.substring(0, s.length() - 1), count);
    }

    //optimized recursion
    //TC: O(n)
    //SC: O(n)
    public static int countVowels2(String s, int index) {
        if (index == s.length()) return 0;
        char ch = s.charAt(index);
//        int add = 0;
//        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//            add++;
//        }
        int add = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? 1 : 0;

        return add + countVowels2(s, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        System.out.println("The no. of vowels in " + s + " is : " + countVowels(s, 0));
        System.out.println("The no. of vowels in " + s + " is : " + countVowels2(s, 0));
    }
}
