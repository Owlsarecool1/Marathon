//Dennis Livshyts
//CECS 274-05
//Prog 1-Marathon
//Due Date (February 11, 23,2020)


import java.util.Scanner;

public class maracara {
    public static void table (String _Name, double user_Pace, double pace){
        System.out.println("Pace Table");
        System.out.printf("Mile\t\t\tEliud\t\t\t\t%s\n", _Name);
        for (int i = 1; i <= 26; i++){
            // calculating time per mile for user
            double temp = user_Pace * i;
            int progressHours = (int) (temp / 3600);
            int progressMinutes = (int) ((temp - (progressHours * 3600) )/ 60);
            int progressSeconds = (int) (temp % 60);


            double eliudp = pace * i;
            int eHours = (int) (eliudp/ 3600);
            int eMin = (int) ((eliudp - (eHours * 3600) )/ 60);
            int eSec = (int) (eliudp % 60);

            System.out.printf("%d\t\t\t\t%d:%02d:%02d\t\t\t\t%d:%02d:%02d\n", i, eHours, eMin, eSec,
                    progressHours, progressMinutes, progressSeconds);
        }

        double tempupace = user_Pace * 26.21875;
        int progHours = (int) (tempupace / 3600);
        int progMinutes = (int) ((tempupace - (progHours * 3600) )/ 60);
        int progSeconds = (int) (tempupace % 60);


        double eliudpace = pace * 26.21875;
        int eHours = (int) (eliudpace / 3600);
        int eMinutes = (int) ((eliudpace - (eHours * 3600) )/ 60);
        int eSeconds = (int) (eliudpace % 60);

        System.out.printf("26m, 385y\t\t%d:%02d:%02d\t\t\t\t%d:%02d:%02d\n", eHours, eMinutes, eSeconds,
                progHours, progMinutes, progSeconds);
    }


    public static void main(String[]arg){
    System.out.println("Welcome to the LA Marathon Program");

    Scanner in = new Scanner(System.in);
    System.out.print("Whats your name? ");
    String Name = in.next();
    System.out.print("How far you run today? ");
    double dist = in.nextDouble();
    System.out.print("hours? ");
    int hour = in.nextInt();
    System.out.print("minutes? ");
    int min = in.nextInt();
    System.out.print("seconds? ");
    int sec = in.nextInt();


    int total_Sec = (hour * 3600) + (min * 60) + sec;
    double p = total_Sec / dist; // pace in seconds
    int pace_Hour = (int) (p / 3600);
    int pace_Min = (int) ((p - (pace_Hour * 3600) )/ 60);

    int pace_Sec = (int) (p % 60);
    System.out.printf("\nHi %s\n", Name);
    System.out.printf("Your pace is %d:%02d:%2d\n", pace_Hour, pace_Min, pace_Sec);


    double pace = (total_Sec / dist) * 26.21875; // pace in seconds
    int paceH = (int) (pace / 3600);
    int paceMin = (int) ((pace - (paceH * 3600) )/ 60);
    int paceSec = (int) (pace % 60);
    System.out.printf(" your marathon time would be %d:%02d:%02d\n", paceH, paceMin, paceSec);
    System.out.println("Good luck training!\n");


    double disto = 26.21875;
    int hours = 1;
    int minutes = 59;
    int seconds = 40;
    int totalSec = (hours * 3600) + (minutes * 60) + seconds;
    double best_pAce = totalSec / disto;

    table(Name, p, best_pAce);
}



}
