package LogicBuilding.Phase5_Strings.Counting_Character;

import java.util.Arrays;

public class EndWithS {
    public static void main(String[] args) {
        String s = "Springs and songs vibe perfectly";
        s = s.toLowerCase().trim();
        int count = 0;
        String[] words = s.split("\\s+");
        for (String w : words) {
            if (w.endsWith("s")) {
                count++;
            }
        }
        //2nd approach
        int count2 = 0;
        for (String w : words) {
            char ch = w.charAt(w.length() - 1);
            if (ch == 's') count2++;
        }
        System.out.println(s);
        System.out.println(Arrays.toString(words));
        System.out.println(count);
        System.out.println(count2);
    }
}
