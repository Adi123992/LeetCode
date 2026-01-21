package LogicBuilding.Phase5_Strings.Character_Manipulation;

public class RemoveAllVowels {
    public static void main(String[] args) {
        String s = "Aditya";
        s = s.toLowerCase();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
//            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
//                res.append(ch);
//            }
            if ("aeiou".indexOf(ch) == -1) {
                res.append(ch);
            }
        }
        System.out.println(s);
        System.out.println(res);
    }
}
