package LogicBuilding.Phase5_Strings.WordLevelThinking;

public class LongestShortestWordLength {
    public static void main(String[] args) {
        String s = "Hey there I am Aditya";
        int max = 0;
        int min = Integer.MAX_VALUE;
        System.out.println(s);
        String[] arr = s.split("\\s+");
        for (String word : arr) {
            if (word.length() > max) max = word.length();
            if (word.length() < min) min = word.length();
        }
        System.out.println("Max length of a word is : " + max);
        System.out.println("Min length of a word is : " + min);
    }
}
