package LogicBuilding.Phase2_Loops_Patterns.LogicalLoops;

public class Palindromes {
    public static boolean palindrome(int n) {
        int temp = n;
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum * 10 + rem;
            n /= 10;
        }
        if (temp == sum) return true;
        return false;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            if (palindrome(i)) System.out.print(i + " ");
        }
    }
}
