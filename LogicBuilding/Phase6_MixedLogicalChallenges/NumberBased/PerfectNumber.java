package LogicBuilding.Phase6_MixedLogicalChallenges.NumberBased;

public class PerfectNumber {
    public static boolean isPerfect(int num) {
        int sumOfFactors = 0;
        //method 1
//        for (int i = 0; i < num; i++) {
//            if (num % i == 0) sumOfFactors += i;
//
//        }
        //method 2
        for (int i = 1; i * i < num; i++) {
            if (num % i == 0) {
                sumOfFactors += i;
                System.out.print(i + " ");
                //avoids duplicates
                if (i != num / i && num / i < num) {
                    sumOfFactors += num / i;
                    System.out.print(num / i + " ");
                }

            }
        }
        System.out.println();
        return num == sumOfFactors;
    }

    public static void main(String[] args) {
        int n = 28;
        System.out.println(n + " is a Perfect No. ? " + isPerfect(n));
    }
}
