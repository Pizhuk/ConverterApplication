package main.com.converter.categoriesOfConversation;

public class Length {
    public double meters;
    public double kilometers;
    public double miles;
    public double nauticalMiles;
    public double cables;
    public double leagues;
    public double feet;
    public double yards;


    public double round(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }


    public double convertMToKm() {
        double kilometers = meters/1000;
        return round(kilometers, 10);
    }

    public double convertKmToM() {
        meters = kilometers*1000;
        return round(meters, 10);
    }


    public double convertMToMile() {
        double miles = meters/1609;
        return round(miles, 10);
    }

    public double convertMileToM() {
        double meters = miles*1609;
        return round(meters, 10);
    }


    // nautical mile - морская миля
    public double convertMToNauticalMile() {
        double nauticalMiles = meters/1852;
        return round(nauticalMiles, 10);
    }

    public double convertNauticalMileToM() {
        double meters = nauticalMiles*1852;
        return round(meters, 10);
    }

    // cable - сантиметр
    public double convertMToCable() {
        double cables = meters/185.2;
        return round(cables, 10);
    }

    public double convertCableToM() {
        double meters = cables*185.2;
        return round(meters, 10);
    }

    // league - морская лига
    public double convertMToLeague() {
        double leagues = meters/5556;
        return round(leagues, 10);
    }

    public double convertLeagueToM() {
        double meters = leagues*5556;
        return round(meters, 10);
    }

    // foot - футы
    public double convertMToFoot() {
        double feet = meters*3.281;
        return round(feet, 10);
    }

    public double convertFootToM() {
        double meters = feet/3.281;
        return round(meters, 10);
    }


    public double convertMToYard() {
        double yards = meters*1.09361;
        return round(yards, 10);
    }

    public double convertYardToM() {
        double meters = yards/1.09361;
        return round(meters, 10);
    }
}

