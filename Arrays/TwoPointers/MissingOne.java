package Arrays.TwoPointers;


public class MissingOne {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        int size = nums.length;
        int sum = 0;
        int arrSum = 0;
        for (int i = 0; i <= size; i++) {
            sum += i;
        }
        for (int j = 0; j < size; j++) {
            arrSum += nums[j];
        }
        return sum - arrSum;
    }
}
