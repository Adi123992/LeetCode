package LogicBuilding.Phase4_Arrays.Searching_Counting;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class UniqueEle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int a : arr) {
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
                System.out.println("The array does not contain all unique elements. ");
                System.out.println(map);
                return;
            } else map.put(a, map.getOrDefault(a, 0) + 1);
        }
        System.out.println("The arry contains all unique elements ");
        System.out.println(map);
    }
}
