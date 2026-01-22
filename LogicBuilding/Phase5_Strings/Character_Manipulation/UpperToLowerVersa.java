package LogicBuilding.Phase5_Strings.Character_Manipulation;

public class UpperToLowerVersa {
    public static void main(String[] args) {
        String s = "Aditya";
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                res.append(Character.toLowerCase(ch));
            } else res.append(Character.toUpperCase(ch));
        }
        System.out.println(s);
        System.out.println(res);
    }
}
