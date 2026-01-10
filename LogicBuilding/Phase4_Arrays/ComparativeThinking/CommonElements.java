package LogicBuilding.Phase4_Arrays.ComparativeThinking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Size of arr 1 : ");
        int size1 = s.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Size of arr 2 : ");
        int size2 = s.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < size1; i++) {
            arr1[i] = s.nextInt();
        }
        for (int i = 0; i < size2; i++) {
            arr2[i] = s.nextInt();
        }
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < size1; i++) {
            m.put(arr1[i], m.getOrDefault(arr1[i], 0) + 1);
        }
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < size2; i++) {
            if (m.containsKey(arr2[i]) && m.get(arr2[i]) > 0) {
                m.put(arr2[i], m.get(arr2[i]) - 1);
                l.add(arr2[i]);
            }

        }
        System.out.println(l);

    }
}
