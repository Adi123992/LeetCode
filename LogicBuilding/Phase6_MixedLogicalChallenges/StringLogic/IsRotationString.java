package LogicBuilding.Phase6_MixedLogicalChallenges.StringLogic;

public class IsRotationString {
    public static void main(String[] args) {
        String s = "college";
        String r = "gecolle";
        String nstr = s + s;
        System.out.println(nstr);
        if (nstr.contains(r)) System.out.println("Is a rotation");
        else System.out.println("Not a rotation");
    }
}
