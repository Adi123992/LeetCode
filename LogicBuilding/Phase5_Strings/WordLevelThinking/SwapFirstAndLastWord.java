package LogicBuilding.Phase5_Strings.WordLevelThinking;

public class SwapFirstAndLastWord {
    public static void main(String[] args) {
        String s = "Hey there I am Aditya";
        String[] words = s.split("\\s+");
        String temp = words[words.length - 1];
        words[words.length - 1] = words[0];
        words[0] = temp;
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        //System.out.println(Arrays.toString(words));
    }
}
