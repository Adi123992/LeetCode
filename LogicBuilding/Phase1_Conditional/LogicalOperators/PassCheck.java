package LogicBuilding.Phase1_Conditional.LogicalOperators;

import java.util.Scanner;

public class PassCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String pass = s.next();
        int count = 0;
        if (pass.length() < 8) {
            System.out.println("The length of password must be atleast of 8 characters ");
            return;
        }
        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        if (count > 0) System.out.println("The password " + pass + " is valid.");
        else System.out.println("Invalid, since the password " + pass + " doesnt contain any digits. ");
    }
}
