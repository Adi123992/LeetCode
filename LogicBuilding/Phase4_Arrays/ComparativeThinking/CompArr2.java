package LogicBuilding.Phase4_Arrays.ComparativeThinking;

import java.util.HashMap;
import java.util.Scanner;

public class CompArr2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        int[] arr2 = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < size; i++) {
            arr2[i] = s.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        //my previous approach :
//        for (int i = 0; i < size; i++) {
//            if (m1.containsKey(arr2[i]) && m1.get(arr2[i]) > 0) {
//                m1.put(arr2[i], m1.get(arr2[i]) - 1);
//            } else {
//                System.out.println("Both arrays are not equal");
//                return;
//            }
//        }
//        System.out.println("Both the arrays are equal irrespective of their order.");
//        System.out.println(m1);
        // Cancel frequencies using second array
        for (int i = 0; i < size; i++) {
            if (!map.containsKey(arr2[i]) || map.get(arr2[i]) == 0) {
                System.out.println("Both arrays are not equal");
                return;
            }
            map.put(arr2[i], map.get(arr2[i]) - 1);
        }

        // Final verification: everything must be zero
        for (int freq : map.values()) {
            if (freq != 0) {
                System.out.println("Both arrays are not equal");
                return;
            }
        }

        System.out.println("Both the arrays are equal irrespective of their order.");

    }
}
