package LogicBuilding.Phase5_Strings.Basic;

public class LexicographicalOrder {
    public static void main(String[] args) {
        String a = "aditya";
        String b = "pradeep";
        int ans = a.compareTo(b);
        if (ans > 1) System.out.println(a + " is greater than " + b);
        else System.out.println(b + " is greater than " + a);
    }
}
