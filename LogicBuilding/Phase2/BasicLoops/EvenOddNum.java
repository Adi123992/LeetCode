package LogicBuilding.Phase2.BasicLoops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EvenOddNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //you can use the traditional method of 2 for loops but this is also one of the way
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) even.add(i);
            else odd.add(i);
        }
        System.out.println("Even numbers : " + Arrays.toString(even.toArray()));
        System.out.println("Odd numbers : " + Arrays.toString(odd.toArray()));
    }
}
