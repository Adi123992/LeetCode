package Arrays;

import java.util.Arrays;

//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.
public class MoveZeros {
    public static void main(String[] args) {
        MoveZeros m = new MoveZeros();
        int[] arr = {0, 1, 0, 3, 12};
        int[] arr2 = {0, 0, 0, 1, 2, 3, 4, 12};
        m.moveZeroes(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    public void moveZeroes(int[] nums) {
        //brute force
        //O(n2)
        // for(int i = 0 ; i < nums.length ; i++){
        //        for(int j = i+1 ; j< nums.length ; j++){
        //            if(nums[i] == 0){
        //                if(nums[j] != 0){
        //                    int temp = nums[j];
        //                    nums[j]=0;
        //                    nums[i]=temp;
        //                }
        //            }
        //        }
        //       }
        //optimized
        //O(n)
//        int snowBallSize = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) {
//                snowBallSize++;
//            } else if (snowBallSize > 0) {
//                //swapping of zeros
//                int t = nums[i];
//                nums[i] = 0;
//                //logic of placing the non-zero
//                nums[i - snowBallSize] = t;
//            }
//        }
        //optimized2
        //O(n) : two pointers
        int i = 0;
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] == 0) {
                if (nums[j] != 0) {
                    int t = nums[j];
                    nums[j] = nums[i];
                    nums[i] = t;
                    i++;
                }

            }
        }
    }
}
