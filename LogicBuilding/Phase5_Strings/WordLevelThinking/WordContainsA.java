package LogicBuilding.Phase5_Strings.WordLevelThinking;

public class WordContainsA {
    public static void main(String[] args) {
        String s = "hey there I am Aditya";
        s = s.toLowerCase();
        int count = 0;
        String[] words = s.split("\\s+");
        for (String word : words) {
            if (word.contains("a")) count++;
        }
        System.out.println("Words containing a are : " + count);
    }
}
