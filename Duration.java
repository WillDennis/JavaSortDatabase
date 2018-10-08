/*
Author:             William Dennis
Student Number:     100157542
Date:               15/11/2017
Project:            CMP-4008Y Programming Coursework
 */
package albumdatabase;
//importing libraries

import java.text.DecimalFormat;

public class Duration {

    //declaring variables - private so they aren't adjusted outside the class
    private int seconds;
    private int mins;
    private int hours;

    public Duration() {
        seconds = 0;
        mins = 0;
        hours = 0;
    }

    public Duration(int hours, int mins, int seconds) {
        //assigning variables 
        this.hours = hours;
        this.mins = mins;
        this.seconds = seconds;
    }

    public Duration(String outputTime) {
        //making sure the splits are put from string to integer and then assigned
        String[] splitTime = outputTime.split(":");
        hours = Integer.parseInt(splitTime[0]);
        mins = Integer.parseInt(splitTime[1]);
        seconds = Integer.parseInt(splitTime[2]);

    }

    public String toString() {
        //make sure there is a format of "00:00:00" for the output duration.
        DecimalFormat df = new DecimalFormat("00");
        return df.format(hours) + ":" + df.format(mins) + ":" + df.format(seconds);
    }

    //returning variables through methods
    public int getHours() {
        return hours;
    }

    public int getMins() {
        return mins;
    }

    public int getSeconds() {
        return seconds;
    }

}
