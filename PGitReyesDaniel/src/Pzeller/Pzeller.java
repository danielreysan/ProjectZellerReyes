/*
18/02//2021
Author: Daniel Reyes Santiago
proyecto de día internacional del programador
*/

package Pzeller;


public class Pzeller {

    
    public static void main(String[] args) {
        int day=28, month=2, year=1996;
        String stDat=birthDay_ZellerMonlau(day, month, year);
        System.out.println("International programmer's day: " + stDat + " sep2021");
    }
    
    private static String birthDay_ZellerMonlau(int day, int month, int year){
        String[] ArrayWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int a, y, m, d;
        a = (14 - month) / 12;
        y = year - a;
        m = month + 12 * a - 2;
        d = (day + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
        return ArrayWeek[d];
    }
    
}
