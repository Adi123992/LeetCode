package Heap.topK;

import java.util.PriorityQueue;

public class kthLargest {
    public static int kthLarge(int[] arr, int k) {
        //min heap
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            queue.add(arr[i]);
        }
        int ans = queue.peek();
        for (int i = k; i < arr.length; i++) {
            if (arr[i] > ans) {
                queue.poll();
                queue.add(arr[i]);
                ans = queue.peek();
            }
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        int ans = kthLarge(new int[]{3, 2, 1, 5, 6, 4}, 2);
        System.out.println(ans);
    }
}
