package LogicBuilding.Phase5_Strings.Character_Manipulation;

//remove consecutive duplicate characters
public class RemoveConseDup {
    private static String removeDup(String s, int index, StringBuilder res) {
        if (index == s.length()) {
            return res.toString();
        }
        if (index == 0 || s.charAt(index) != s.charAt(index - 1)) {
            res.append(s.charAt(index));
        }
        return removeDup(s, index + 1, res);
    }

    public static void main(String[] args) {
        String s = "aabbccdeee"; // op should be "abcde"
        System.out.println(s);
        System.out.println(removeDup(s, 0, new StringBuilder()));
    }
}
