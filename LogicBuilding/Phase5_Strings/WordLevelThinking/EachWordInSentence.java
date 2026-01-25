package LogicBuilding.Phase5_Strings.WordLevelThinking;

public class EachWordInSentence {
    public static void main(String[] args) {
        String s = "Hey there I am Aditya";
        System.out.println(s);
        String[] arr = s.split("\\s+");
        for (String words : arr) {
            System.out.println(words);
        }
    }
}
