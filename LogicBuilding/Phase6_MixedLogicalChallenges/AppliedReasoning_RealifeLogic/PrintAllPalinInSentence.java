package LogicBuilding.Phase6_MixedLogicalChallenges.AppliedReasoning_RealifeLogic;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPalinInSentence {
    public static boolean isPalin(String s) {
        StringBuilder res = new StringBuilder(s);
        res.reverse();
        //s.equals(res.toString());
        return s.contentEquals(res);
    }

    public static void main(String[] args) {
        String s = "Nayan drives a racecar";
        s = s.toLowerCase();
        List<String> w = new ArrayList<>();
        String[] words = s.split("\\s+");
        for (String word : words) {
            if (isPalin(word)) w.add(word);
        }
        System.out.println("Palindrome words : " + w);
    }
}
