package LogicBuilding.Phase1_Conditional.NestedLoops;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int marks = s.nextInt();
        if (marks > 89) System.out.println("Grade : A");
        else if (marks > 79) System.out.println("Grade : B");
        else if (marks > 69) System.out.println("Grade : C");
        else if (marks > 59) System.out.println("Grade : D");
        else if (marks > 49) System.out.println("Grade : E");
        else System.out.println("Grade : Failed");
    }
}
