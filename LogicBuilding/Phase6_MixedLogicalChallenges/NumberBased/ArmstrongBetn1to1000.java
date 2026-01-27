package LogicBuilding.Phase6_MixedLogicalChallenges.NumberBased;

public class ArmstrongBetn1to1000 {
    public static boolean isArmstrong(int num) {
        int temp = num;
        int digits = (int) Math.log10(num) + 1;
        int armstrong = 0;
        while (num != 0) {
            int rem = num % 10;
            armstrong += (int) Math.pow(rem, digits);
            num /= 10;
        }
        return temp == armstrong;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            } else continue;
        }
    }
}
