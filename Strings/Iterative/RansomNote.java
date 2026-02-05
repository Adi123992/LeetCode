package Strings.Iterative;

public class RansomNote {
    public static boolean isValid(String ransomNote, String magazine) {
        int[] arr = new int[26];
        int val = 0;
        //for magazine frequency filling
        for (int i = 0; i < magazine.length(); i++) {
            val = magazine.charAt(i) - 'a';
            arr[val]++;
            val = 0;
        }
        //for ransom note frequency filling
        for (int i = 0; i < ransomNote.length(); i++) {
            val = ransomNote.charAt(i) - 'a';
            arr[val]--;
            if (arr[val] < 0) {
                return false;
            }
            val = 0;
        }
        return true;
    }

    public static void main(String[] args) {
        String rn = "aa";
        String mg = "bb";
        System.out.println(isValid(rn, mg));
    }
}
