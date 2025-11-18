package SlidingWindow;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 21, 4, 32, 10, 3};
        MaxSubarraySum maxSubarraySum = new MaxSubarraySum();
        System.out.println(maxSubarraySum.maxSubarraySum(arr, 3));

    }

    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;

        // Edge case
        if (n < k) return 0;

        long sum = 0;
        long maxs = 0;

        // Step 1: Pehle k elements ka sum
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        maxs = sum;

        // Step 2: Sliding window approach
        for (int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k]; // naya element add karo, purana hatao
            maxs = Math.max(maxs, sum);
        }

        // Step 3: Return final answer
        return (int) maxs;
    }
}
