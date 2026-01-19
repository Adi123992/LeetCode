package LogicBuilding.Phase5_Strings.Counting_Character;

public class FreqWithoutMap {
    public static void main(String[] args) {
        String s = "Adityaaa";
        int[] freq = new int[256];//ASCII range
        //freq counting
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }
        //ASCII values ranges from 0 to 256
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) System.out.println((char) (i) + " : " + freq[i]);
        }
    }
}
