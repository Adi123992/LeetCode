package LogicBuilding.Phase4_Arrays.LogicalProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

//elements that exactly occur onces and are unique
public class UniqueElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        //TC: O(n)+O(n) = O(n)
        //SC: O(n)
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
        }
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (m.get(arr[i]) == 1) l.add(arr[i]);
        }
        System.out.println("Unique elements list : " + l);
    }
}
