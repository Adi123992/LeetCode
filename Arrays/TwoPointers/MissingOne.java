package Arrays.TwoPointers;


public class MissingOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 3};
        System.out.println(missingNumber(arr));
        System.out.println(missingNumber2(arr));
    }

    public static int missingNumber2(int[] nums) {
        //since the loop wont include the length element hence add it in xor itself
        int xor = nums.length;
        //wkt 0 ^ a = a && a ^ a = 0 so the number that wont find its pair will be returned
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
            xor ^= i;
        }
        return xor;
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
