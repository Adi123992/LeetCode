package LogicBuilding.Phase2_Loops_Patterns.LogicalLoops;

public class DivBy7or5 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 500; i++) {
            if (i % 7 == 0 && i % 5 != 0) count++;
        }
        System.out.println("COunt of numbers divisible by either 7 or 5 is : " + count);
    }
}
