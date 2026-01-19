package LogicBuilding.Phase5_Strings.Counting_Character;

public class NumLetterChar {
    public static void main(String[] args) {
        String s = "Addie9021@";
        int dig = 0;
        int let = 0;
        int charac = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) dig++;
            else if (Character.isAlphabetic(ch)) let++;
            else charac++;
        }
        System.out.println(s);
        System.out.println("Digits : " + dig);
        System.out.println("Alphabets : " + let);
        System.out.println("Special Character : " + charac);
    }
}
