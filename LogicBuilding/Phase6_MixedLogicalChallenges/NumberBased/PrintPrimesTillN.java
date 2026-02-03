package LogicBuilding.Phase6_MixedLogicalChallenges.NumberBased;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintPrimesTillN {
    public static List<Integer> isPrime(boolean[] num) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 2; i * i < num.length; i++) {
            if (!num[i]) {
                //since the lower multiples are already handled earlier so you can start your loop with j = i * i as well both would work similar
                for (int j = i * 2; j < num.length; j += i) {
                    num[j] = true;
                }
            }
        }
        for (int i = 2; i < num.length; i++) {
            if (!num[i]) ans.add(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number limit : ");
        int n = sc.nextInt();
        boolean[] arr = new boolean[n + 1];
        List<Integer> ans = isPrime(arr);
        System.out.println(ans);
    }
}
