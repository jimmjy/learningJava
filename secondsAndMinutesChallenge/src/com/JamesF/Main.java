package com.JamesF;

public class Main {

    public static void main(String[] args) {

        String duration = getDurationString(300945);
        System.out.println(duration);

    }

    private static String getDurationString(int minutes, int seconds) {

        String statement = "Invalid value";

        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {

            if (minutes / 60 > 9) {
                int hour = minutes / 60;
                int min = (minutes % 60);

                statement = hour + "h " + min + "m " + seconds + "s";

            } else {
                int hour = minutes / 60;
                int min = (minutes % 60);

                statement = "0" + hour + "h 0" + min + "m 0" + seconds + "s";
            }


        }

        return statement;
    }

    private static String getDurationString(int seconds) {

        if (seconds >= 0) {
            int minutes = seconds / 60;
            int secs = seconds % 60;
            return getDurationString(minutes, secs);
        }

        return "Invalid value";
    }
}
