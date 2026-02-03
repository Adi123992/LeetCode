package LogicBuilding.Phase6_MixedLogicalChallenges.AppliedReasoning_RealifeLogic;

public class ValidPassword {
    public static boolean isValidPass(String pass) {
        int up = 0;
        int low = 0;
        int digit = 0;
        int special = 0;
        pass = pass.trim();
        for (char ch : pass.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                if (Character.isUpperCase(ch)) up++;
                else if (Character.isLowerCase(ch)) low++;
            } else if (Character.isDigit(ch)) digit++;
            else special++;
        }
        return up > 0 && low > 0 && digit > 0 && special > 0;
    }

    public static void main(String[] args) {
        String pass = "Addie9021@";
        System.out.println("Password " + pass + " is valid ? " + isValidPass(pass));
    }
}
