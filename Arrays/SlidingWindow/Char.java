package Arrays.SlidingWindow;

import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            res = res * 26 + (ch - 'A' + 1);
        }
        System.out.println(res);
        String str = "Hey there, I am Aditya";
        //for replacing all the spaces and alphanumerics wiht an empty string this helps to compare well..
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        System.out.println(str);
    }
}
