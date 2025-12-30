package LogicBuilding.Phase2.LogicalLoops;

import java.util.Scanner;

public class BinaryEvenOnes {
    public static int reverse(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum * 10 + rem;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = n;
        int count = 0;
        int binary = 0;
        while (n != 0) {
            int b = n % 2;
            if (b == 1) count++;
            binary = binary * 10 + b;
            n = n / 2;
        }
        System.out.println(temp + " binary form is " + reverse(binary));
        System.out.println("It contains " + count + " ones in it.");
    }
}
