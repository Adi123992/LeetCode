package Arrays;

import java.util.Iterator;
import java.util.TreeSet;

public class ThirdMax {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 3};
        System.out.println(thirdMax(arr));
    }

    public static int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if (set.size() < 3) {
            return set.last();
        }
        Iterator<Integer> it = set.descendingIterator();
        int first = it.next();
        int second = it.next();
        int third = it.next();
        return third;
    }
}
