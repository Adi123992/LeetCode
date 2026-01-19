package LogicBuilding.Phase5_Strings.Basic;

public class EmptyStringCheck {
    public static void main(String[] args) {
        String s = "  ";
        s = s.trim();
        if (s.isEmpty()) System.out.println("Is an empty string");
        else System.out.println("Not an empty string");
    }
}
