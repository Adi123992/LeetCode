package LogicBuilding.Phase6_MixedLogicalChallenges.StringLogic;

import java.util.ArrayList;

public class CharMoreThan2 {
    public static void main(String[] args) {
        String s = "addiiittttyaaaa";
        int[] freq = new int[26];
        ArrayList<Character> list = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            int val = ch - 'a';
            freq[val]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 2) {
                char ch = (char) ((char) i + 'a');
                list.add(ch);
            }
        }
        System.out.println(list.toString());
//        char c = 'n' + 97;
//        int x = 'a';
//        System.out.println(c);
//        System.out.println(x);
    }
}
