package LogicBuilding.Phase3_Recursion.Number_Based;

import java.util.List;
import java.util.Scanner;

public class NumberInWords {
    public static List<String> list = List.of("Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine");

    //TC & SC: O(digits) call stack
    public static String words(int n) {
        if (n == 0) return "";
        return words(n / 10) + list.get(n % 10) + " ";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n == 0)
            System.out.println("Zero");
        else
            System.out.println(words(n));
    }
}
