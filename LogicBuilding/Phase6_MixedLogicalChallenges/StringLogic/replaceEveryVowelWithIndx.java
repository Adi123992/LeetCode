package LogicBuilding.Phase6_MixedLogicalChallenges.StringLogic;

public class replaceEveryVowelWithIndx {
    public static String replaceVowel(String s) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                sb.append(index);
            } else sb.append(ch);
            index++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "aditya";
        String res = replaceVowel(s);
        System.out.println(s);
        System.out.println(res);
    }
}
