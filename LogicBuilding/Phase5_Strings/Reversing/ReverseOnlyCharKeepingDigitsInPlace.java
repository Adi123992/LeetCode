package LogicBuilding.Phase5_Strings.Reversing;

public class ReverseOnlyCharKeepingDigitsInPlace {
    // two pointers approach
    public static void main(String[] args) {
        String s = "a1b2c3";
        char[] arr = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (!Character.isAlphabetic(arr[left])) {
                left++;
                continue;
            }
            if (!Character.isAlphabetic(arr[right])) {
                right--;
                continue;
            }
            //swap the letters
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(s);
        System.out.println(new String(arr));
    }
}
