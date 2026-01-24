package LogicBuilding.Phase5_Strings.Reversing;

public class Palindrome {
    public static void main(String[] args) {
        String s = "Aditya";
        String str = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            sb.append(ch);
        }
        System.out.println(s);
        System.out.println(sb);
        System.out.println(s.equals(sb));
    }
}
