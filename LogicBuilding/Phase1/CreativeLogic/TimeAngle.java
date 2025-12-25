package LogicBuilding.Phase1.CreativeLogic;

import java.util.Scanner;

public class TimeAngle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hrs = s.nextInt();
        int min = s.nextInt();
        //total 12 hrs = 360 degrees
        //for hr
        //1 hr = 30 degrees
        //1 min = 0.5 degrees
        //for min
        //60 min = 360 degrees
        //1 min = 6 degree
        double minangle = 0;
        double hrangle = 0;
        double angle = 0;
        //min
        minangle = min * 6;
        hrangle = hrs * 30 + min * 0.5;
        angle = Math.abs(minangle - hrangle);
        if (angle > 180)
            angle = 360 - angle;
        System.out.println("The minimum angle between time " + hrs + " hrs, " + min + " min is : " + angle);

    }
}
