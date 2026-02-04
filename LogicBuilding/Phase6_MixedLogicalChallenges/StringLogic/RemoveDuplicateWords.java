package LogicBuilding.Phase6_MixedLogicalChallenges.StringLogic;

import java.util.HashSet;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String sent = "Hello there I am there am Aditya";
        String[] words = sent.split("\\s+");
//        HashMap<String, Integer> m = new HashMap<>();
//        String res = "";
//        for (String word : words) {
//            if (m.containsKey(word)) continue;
//            else {
//                m.put(word, 1);
//                res = res + word + " ";
//            }
//        }
        StringBuilder res = new StringBuilder();
        HashSet<String> set = new HashSet<>();
        for (String word : words) {
            if (set.contains(word)) continue;
            else {
                set.add(word);
                res.append(word).append(" ");
            }
        }
        System.out.println(res.toString());
    }
}
