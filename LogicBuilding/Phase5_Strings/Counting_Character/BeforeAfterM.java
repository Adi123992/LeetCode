package LogicBuilding.Phase5_Strings.Counting_Character;

public class BeforeAfterM {
    public static void main(String[] args) {
        String s = "Anushree";
        s = s.toLowerCase();
        int bef = 0;
        int aft = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch < 'm') bef++;
            else aft++;
        }
        System.out.println(s);
        System.out.println("Before : " + bef);
        System.out.println("After : " + aft);
    }
}
