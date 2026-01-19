package LogicBuilding.Phase5_Strings.Counting_Character;

public class VowelsConsonants {
    public static void main(String[] args) {
        String s = "Aditya";
        s = s.toLowerCase();
        int vow = 0;
        int con = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vow++;
            else con++;
        }
        System.out.println(s);
        System.out.println("Vowels : " + vow);
        System.out.println("Consonants : " + con);
    }
}
