package LogicBuilding.Phase5_Strings.Character_Manipulation;

public class StringAfterRemvDigits {
    public static void main(String[] args) {
        String str = "Addie9021@";
        String s = str.toLowerCase().trim();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isDigit(ch)) res.append(ch);
        }
        System.out.println(str);
        System.out.println(res);
    }
}
