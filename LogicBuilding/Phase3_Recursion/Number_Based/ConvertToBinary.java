package LogicBuilding.Phase3_Recursion.Number_Based;

import java.util.Scanner;

public class ConvertToBinary {
    //    public static int toBinary(int n, int rev) {
//        if (n == 0) return rev;
//        return toBinary(n / 2, rev * 10 + (n % 2));
//    }
    public static String toBinary(int n) {
        if (n == 0) return "";

        return toBinary(n / 2) + (n % 2);
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n == 0)
            System.out.println("Binary form of 0 is 0");
        else
            System.out.println("Binary form of " + n + " is: " + toBinary(n));

    }
}
