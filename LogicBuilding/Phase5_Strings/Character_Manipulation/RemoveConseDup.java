package LogicBuilding.Phase5_Strings.Character_Manipulation;

//remove consecutive duplicate characters
public class RemoveConseDup {
    private static String removeDup(String s, int index, StringBuilder res) {
        if (index == s.length()) {
            return res.toString();
        }
        if (index == 0) {
            res.append(s.charAt(index));
        } else if (s.charAt(index - 1) != s.charAt(index)) {
            return removeDup(s, index + 1, res.append(s.charAt(index)));
        }
        return removeDup(s, index + 1, res);
    }

    public static void main(String[] args) {
        String s = "aaabb"; // op should be "ab"
        System.out.println(removeDup(s, 0, new StringBuilder()));
    }
}
