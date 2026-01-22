package LogicBuilding.Phase5_Strings.Character_Manipulation;

public class ReplaceVowels {
    public static void main(String[] args) {
        String s = "Aditya";
        s = s.toLowerCase();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //if vowels not found replace with '*'
            if ("aeiou".indexOf(ch) == -1) {
                res.append(ch);
            } else res.append("*");
        }
        System.out.println(s);
        System.out.println(res);
    }
}
