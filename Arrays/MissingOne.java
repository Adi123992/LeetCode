package Arrays;

class Solution2 {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int sum = 0;
        int arrSum = 0;
        for(int i =0 ; i <= size ; i++){
            sum+=i;
        }
        for(int j = 0; j < size ; j++){
            arrSum+=nums[j];
        }
        return sum - arrSum;
    }
}
public class MissingOne {
    public static void main(String[] args) {
        int[] arr = {1,0,3};
        Solution2 s = new Solution2();
        System.out.println(s.missingNumber(arr));
    }
}
