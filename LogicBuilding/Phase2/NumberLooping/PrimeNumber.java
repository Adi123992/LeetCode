package LogicBuilding.Phase2.NumberLooping;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (isPrime(n)) System.out.println(n + " is a Prime no.");
        else System.out.println(n + " is not a Prime no.");
    }
}
