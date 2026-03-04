package LogicBuilding.Phase6_MixedLogicalChallenges.StringLogic;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDupWords {
    public static void main(String[] args) {
        String s = "I am the Amazing Amazing Spidey man man";
        String[] words = s.split("\\s+");
        LinkedHashSet<String> set = new LinkedHashSet<>();
        //traditional way
//        for (String word : words) {
//            set.add(word);
//        }
        //alternate way
        Collections.addAll(set, words);
        Iterator i = set.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
    }
}
