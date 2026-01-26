package LogicBuilding.Phase5_Strings.WordLevelThinking;

public class RemoveExtraSpaces {
    public static void main(String[] args) {
        String s = "hey          there   i am aditya";
        String[] words = s.split("\\s+");
        System.out.println(String.join(" ", words));

    }
}
