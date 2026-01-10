package LogicBuilding.Phase4_Arrays.ComparativeThinking;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

//Building frequency map: O(n)
//Second pass through array: O(n)
//HashMap & HashSet operations: O(1) average
//Total time: O(n)
//Extra space: O(n)
public class MoreThanOnce {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Size of arr 1 : ");
        int size1 = s.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = s.nextInt();
        }
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < size1; i++) {
            m.put(arr1[i], m.getOrDefault(arr1[i], 0) + 1);
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < size1; i++) {
            if (m.get(arr1[i]) > 1) set.add(arr1[i]);
        }
        System.out.println(set);
    }
}
