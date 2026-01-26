package LogicBuilding.Phase5_Strings.WordLevelThinking;

public class CapitalizeFirstLetterOfEachWord {
    public static void main(String[] args) {
        String s = "hey there i am aditya";
        String[] words = s.split("\\s+");
        for (String word : words) {
            char prefix = Character.toUpperCase(word.charAt(0));
            String suffix = word.substring(1);
            System.out.print(prefix + suffix + " ");
        }

    }
}
