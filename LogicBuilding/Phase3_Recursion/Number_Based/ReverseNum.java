package LogicBuilding.Phase3_Recursion.Number_Based;

import java.util.Scanner;

public class ReverseNum {
    //brute force
    public static int reverse(int n, int d) {
        //TC: O(digits sq) and SC: O(digits) call stack
        if (n == 0) {
            return 0;
        }
        return (int) ((n % 10) * Math.pow(10, d - 1)) + reverse(n / 10, d - 1);
    }

    //optimized
    public static int reverse2(int n, int rev) {
        //the rev variable is the final reversed number that is being calculated using the tail recursion
        //TC: O(digits) and SC: O(digits) call stack
        //more efficient
        if (n == 0) return rev;
        return reverse2(n / 10, rev * 10 + n % 10);
    }

    public static int digits(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + digits(n / 10);
    }

    public static void palindrome(int n) {
        int rev = reverse2(n, 0);
        if (n == rev) System.out.println("It is a palindrome");
        else System.out.println("It is not a palindrome");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num == 0) {
            System.out.println("Reverse of 0 is 0");
        }
        int digits = digits(num);
        System.out.println("Reverse of " + num + " is : " + reverse(num, digits));
        System.out.println("Reverse of " + num + " is : " + reverse2(num, 0));
        palindrome(num);
    }
}
