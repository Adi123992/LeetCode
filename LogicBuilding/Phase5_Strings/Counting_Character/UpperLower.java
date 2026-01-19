package LogicBuilding.Phase5_Strings.Counting_Character;

public class UpperLower {
    public static void main(String[] args) {
        String s = "AditYa";
        int up = 0;
        int low = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) up++;
            else low++;
        }
        System.out.println(s);
        System.out.println("Uppercase : " + up);
        System.out.println("Lowercase : " + low);
    }
}
