package LogicBuilding.Phase1_Conditional.Simple;

public class EvenOdd {
    public static void main(String[] args) {
        int a = 2;
        if (a % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");
        System.out.println("=====================");
        String s = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println(s);
    }
}
