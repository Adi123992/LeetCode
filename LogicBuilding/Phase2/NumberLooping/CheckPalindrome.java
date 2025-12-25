package LogicBuilding.Phase2.NumberLooping;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int temp = num;
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum = sum * 10 + rem;
            num /= 10;
        }
        if (sum == temp) System.out.println(temp + " is a Palindrome.");
        else System.out.println(temp + " is not a Palindrome.");
    }
}
