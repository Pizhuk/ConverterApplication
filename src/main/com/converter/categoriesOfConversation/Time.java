package main.com.converter.categoriesOfConversation;

public class Time {
    public double sec;
    public double min;
    public double hour;
    public double day;
    public double week;
    public double month;
    public double year;

    public double round(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }


    public double convertSecToMin() {
        double min = sec/60;
        return round(min, 10);
    }

    public double convertMinToSec() {
        double sec = min*60;
        return round(sec, 10);
    }

//  ______________________________________________

    public double convertSecToHour() {
        double hour = sec/3600;
        return round(hour, 10);
    }

    public double convertHourToSec() {
        double sec = hour*3600;
        return round(sec, 10);
    }

//  ______________________________________________

    public double convertSecToDay() {
        double day = sec/3600/24;
        return round(day, 10);
    }

    public double convertDayToSec() {
        double sec = day*24*3600;
        return round(sec, 10);
    }

//  _______________________________________________

    public double convertSecToWeek() {
        double week = sec/3600/24/7;
        return round(week, 10);
    }

    public double convertWeekToSec() {
        double sec = week*3600*24*7;
        return round(sec, 10);
    }

//  ________________________________________________

    public double convertSecToMonth() {
        double month = sec/3600/24/30.4167;
        return round(month, 10);
    }

    public double convertMonthToSec() {
        double sec = month*3600*24*30.4167;
        return round(sec, 10);
    }

//  _________________________________________________

    public double convertSecToYear() {
        double year = sec/3600/24/365;
        return round(year, 10);
    }

    public double convertYearToSec() {
        double sec = year*3600*24*365;
        return round(sec, 10);
    }

}

