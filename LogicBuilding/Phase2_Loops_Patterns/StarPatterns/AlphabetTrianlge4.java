package LogicBuilding.Phase2_Loops_Patterns.StarPatterns;

import java.util.Scanner;

public class AlphabetTrianlge4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
