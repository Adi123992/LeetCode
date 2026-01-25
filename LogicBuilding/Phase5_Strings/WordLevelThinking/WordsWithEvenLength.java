package LogicBuilding.Phase5_Strings.WordLevelThinking;

public class WordsWithEvenLength {
    public static void main(String[] args) {
        String s = "Hey there I am Aditya";
        int count = 0;
        System.out.println(s);
        String[] arr = s.split("\\s+");
        for (String words : arr) {
            if (words.length() % 2 == 0) count++;
        }
        System.out.println("Words of even length are : " + count);
    }
}
