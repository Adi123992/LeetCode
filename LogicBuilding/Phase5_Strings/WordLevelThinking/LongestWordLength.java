package LogicBuilding.Phase5_Strings.WordLevelThinking;

public class LongestWordLength {
    public static void main(String[] args) {
        String s = "Hey there I am Aditya";
        int max = 0;
        System.out.println(s);
        String[] arr = s.split("\\s+");
        for (String word : arr) {
            if (word.length() > max) max = word.length();
        }
        System.out.println("Max length of a word is : " + max);
    }
}
