package LogicBuilding.Phase6_MixedLogicalChallenges.StringLogic;

import java.util.HashMap;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String sent = "Hello there I am there am Aditya";
        String[] words = sent.split("\\s+");
        HashMap<String, Integer> m = new HashMap<>();
        String res = "";
        for (String word : words) {
            if (m.containsKey(word)) continue;
            else {
                m.put(word, 1);
                res = res + word + " ";
            }
        }
        System.out.println(res.trim());
    }
}
