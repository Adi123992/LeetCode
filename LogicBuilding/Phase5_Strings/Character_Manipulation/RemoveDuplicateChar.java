package LogicBuilding.Phase5_Strings.Character_Manipulation;

import java.util.HashMap;

//removed the duplicated and kept there 1st occurences as well.
public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String s = "abacb";
        StringBuilder res = new StringBuilder();
        HashMap<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!m.containsKey(ch)) {
                res.append(ch);
            }
            m.put(ch, m.getOrDefault(ch, 0) + 1);
        }
        System.out.println(s);
        System.out.println(res);

    }
}
