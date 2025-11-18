package Arrays;

import java.util.Arrays;

//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int snowBallSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                snowBallSize++;
            } else if (snowBallSize > 0) {
                //swapping of zeros
                int t = nums[i];
                nums[i]=0;
                //logic of placing the non zero
                nums[i-snowBallSize]=t;
            }
        }
    }

    public static void main(String[] args) {
        MoveZeros m = new MoveZeros();
        int[] arr = {0,1,0,3,12};
        int[] arr2 = {0,0,0,1,2,3,4,12};
        m.moveZeroes(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
