package LogicBuilding.Phase5_Strings.Reversing;

public class ReverseOrderOfWords {
    public static void main(String[] args) {
        String s = "Hi there I am Aditya";
        String[] words = s.split("\\s+");
        System.out.print("Original : " + s);
        System.out.println();
        System.out.print("Reversed : ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
