package LogicBuilding.Phase5_Strings.Counting_Character;

import java.util.Arrays;

public class WordStartWithVowel {
    public static void main(String[] args) {
        String s = "Hello there, I am Aditya";
        s = s.trim().toLowerCase();
        int count = 0;
        String[] words = s.split("\\s+");//remove extra spaces
        for (String w : words) {
            char ch = w.charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') count++;
        }
        System.out.println(s);
        System.out.println(Arrays.toString(words));
        System.out.println(count);
    }
}
