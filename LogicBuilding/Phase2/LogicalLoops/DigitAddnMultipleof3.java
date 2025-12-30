package LogicBuilding.Phase2.LogicalLoops;

public class DigitAddnMultipleof3 {
    public static int digitSum(int n) {
        int temp = n;
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int dsum = digitSum(i);
            if (dsum % 3 == 0) System.out.print(i + " ");
        }
    }
}
