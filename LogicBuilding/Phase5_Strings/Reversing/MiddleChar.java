package LogicBuilding.Phase5_Strings.Reversing;

public class MiddleChar {
    public static void main(String[] args) {
        String s = "anushri";
        int slow = 0;
        int fast = 0;
        while (fast < s.length() - 1) {
            slow += 1;
            fast += 2;
        }
        System.out.println(s);
        System.out.println("Middle character  : " + s.charAt(slow));
    }
}
