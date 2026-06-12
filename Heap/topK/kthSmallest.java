package Heap.topK;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthSmallest {
    public static int kthSmall(int[] arr, int k) {
        //max heap
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            queue.add(arr[i]);
        }
        int kthSmall = queue.peek();

        for (int i = k; i < arr.length; i++) {
            if (arr[i] < kthSmall) {
                queue.poll();
                queue.add(arr[i]);
                kthSmall = queue.peek();
            }
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        int ans = kthSmall(new int[]{3, 12, 4, 6, 15, 632, 2}, 4);
        System.out.println(ans);
    }
}
