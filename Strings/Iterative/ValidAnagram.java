package Strings.Iterative;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean validAnagram(String s, String ana) {
        char[] s1 = s.toCharArray();
        char[] s2 = ana.toCharArray();
        Arrays.sort(s1);//sort both the list since there are formed by literally the same character and their frequencies
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }

    public static void main(String[] args) {
        String str = "anagram";
        String ana = "nagaram";
        System.out.println(validAnagram(str, ana));
    }
}
