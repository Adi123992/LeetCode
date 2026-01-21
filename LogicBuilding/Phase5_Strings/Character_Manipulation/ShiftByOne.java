package LogicBuilding.Phase5_Strings.Character_Manipulation;

public class ShiftByOne {
    public static String shiftByOne(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            res.append((char) (ch + 1));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "abc"; // op : "bcd"
        System.out.println(s);
        System.out.println(shiftByOne(s));
    }
}
