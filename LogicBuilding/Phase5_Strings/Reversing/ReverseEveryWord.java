package LogicBuilding.Phase5_Strings.Reversing;

public class ReverseEveryWord {
    public static String reverse(String s) {
        if (s.isEmpty()) return s;
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String s = "Hi there I am Aditya";
        String[] words = s.split("\\s+");
        System.out.print("Original : " + s);
        System.out.println();
        System.out.print("Reversed : ");
        for (String word : words) {
            String w = reverse(word);
            System.out.print(w + " ");
        }
    }
}
