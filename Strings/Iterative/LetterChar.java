package Strings.Iterative;

import java.util.Scanner;

public class LetterChar {

    public static String convertToExcelColumn(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            n--; // adjust for 0-indexing
            int rem = n % 26;

            sb.append((char) ('A' + rem));

            n = n / 26;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(convertToExcelColumn(n));
    }
}