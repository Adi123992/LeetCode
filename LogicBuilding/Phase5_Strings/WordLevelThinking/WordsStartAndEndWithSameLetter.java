package LogicBuilding.Phase5_Strings.WordLevelThinking;

public class WordsStartAndEndWithSameLetter {
    public static void main(String[] args) {
        String s = "Hey there I am Aditya";
        s = s.toLowerCase();
        String[] words = s.split("\\s+");
        for (String word : words) {
            char ch = word.charAt(0);
            char ch1 = word.charAt(word.length() - 1);
            if (ch == ch1) System.out.print(word + " ");
        }
    }
}
