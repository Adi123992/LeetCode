package LogicBuilding.Phase1_Conditional.NestedLoops;

public class CharCheck {
    public static void main(String[] args) {
        char ch = 'A';
        char c = Character.toLowerCase(ch);
        if (c >= 'a' && c <= 'm') System.out.println("Lies in phase 1");
        else if (c >= 'n' && c <= 'z') System.out.println("Lies in phase 2");
        else System.out.println("Not an Alphabet character ");
    }
}
