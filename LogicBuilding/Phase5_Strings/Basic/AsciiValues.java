package LogicBuilding.Phase5_Strings.Basic;

public class AsciiValues {
    public static void main(String[] args) {
        String s = "Aditya";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.print(ch + " : " + (int) ch + " , ");
        }
        System.out.println();
        System.out.println("Alternate method");
        for (char ch : s.toCharArray()) {
            System.out.print(ch + " : " + (int) ch + " ,");
        }
    }
}
