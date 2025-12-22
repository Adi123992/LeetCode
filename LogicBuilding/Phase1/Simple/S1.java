package LogicBuilding.Phase1.Simple;

public class S1 {
    public static void main(String[] args) {
        int a = 10;
        if (a > 0) System.out.println("Positive");
        else if (a < 0) System.out.println("Negative");
        else System.out.println("Zero");
        String s = (a >= 0) ? "Positive" : "Negative";
        System.out.println(s);
    }
}
