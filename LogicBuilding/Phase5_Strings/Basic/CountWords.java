package LogicBuilding.Phase5_Strings.Basic;

public class CountWords {
    public static void main(String[] args) {
        String s = "Hey there, I am Aditya. ";
        s = s.trim();
        String[] arr = s.split(" ");
        System.out.println(arr.length);
    }
}
