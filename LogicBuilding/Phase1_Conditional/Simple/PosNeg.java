package LogicBuilding.Phase1_Conditional.Simple;

public class PosNeg {
    public static void main(String[] args) {
        int a = 10;
        if (a > 0) System.out.println("Positive");
        else if (a < 0) System.out.println("Negative");
        else System.out.println("Zero");
        String s = (a >= 0) ? "Positive" : "Negative";
        System.out.println(s);
    }
}
