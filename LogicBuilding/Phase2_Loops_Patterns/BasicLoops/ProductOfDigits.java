package LogicBuilding.Phase2_Loops_Patterns.BasicLoops;

public class ProductOfDigits {
    public static void main(String[] args) {
        int num = 542;
        int prod = 1;
        int temp = num;
        while (num != 0) {
            int rem = num % 10;
            prod *= rem;
            num /= 10;
        }
        System.out.println("Product of digits of " + temp + " is : " + prod);
    }
}
