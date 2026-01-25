package LogicBuilding.Phase5_Strings.Reversing;

public class SecondHalfInRev {
    public static void main(String[] args) {
        String s = "hi there I am Adii";
        StringBuilder res = new StringBuilder();
        int fast = 0;
        int slow = 0;
        while (fast < s.length() - 1) {
            slow += 1;
            fast += 2;
        }
        res.append(s.substring(0, slow));
        res.append(reverse(s.substring(slow, s.length())));
        System.out.println(res);

    }

    public static StringBuilder reverse(String s) {
        StringBuilder x = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            x.append(s.charAt(i));
        }
        return x;
    }
}
