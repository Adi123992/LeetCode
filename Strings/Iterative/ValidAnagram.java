package Strings.Iterative;

import java.util.Arrays;

public class ValidAnagram {
    //efficient
    public static boolean validAnagram(String s, String ana) {
        char[] s1 = s.toCharArray();
        char[] s2 = ana.toCharArray();
        Arrays.sort(s1);//sort both the list since there are formed by literally the same character and their frequencies
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }

    //more efficient
    public static boolean validAnagram2(String s, String ana) {
        int[] a = new int[26];
        int[] b = new int[26];
        for (char ch : s.toCharArray()) {
            int val = ch - 'a';
            a[val]++;
        }
        for (char ch : ana.toCharArray()) {
            int val = ch - 'a';
            b[val]++;
        }
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        String str = "anagram";
        String ana = "nagaram";
        System.out.println(validAnagram(str, ana));
        System.out.println(validAnagram2(str, ana));
    }
}
//m2:
//if(a.length==b.length){
//     for(int i=0;i<a.length;i++){
//         boolean found=false;
//         for(int j=0;j<b.length;j++){
//             if(a[i]==b[j]){
//             found=true;
//             b[j]=' ';
//             break;
//             }
//         }
//         if(found!=true) return false;
//     }
// }
// return false;