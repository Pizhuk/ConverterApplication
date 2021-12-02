package main.com.converter.categoriesOfConversation;

public class Volume {
    public double L;
    public double cubicMetre;
    public double gallon;
    public double pint;
    public double quart;
    public double barrel;
    public double cubicFoot;
    public double cubicInch;

    public double round(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }


    public double convertLToCubicMetre() {
        double cubicMetre = L/1000;
        return round(cubicMetre, 10);
    }

    public double convertCubicMetreToL() {
        double L = cubicMetre*1000;
        return round(L, 10);
    }

//  _______________________________________________

    public double convertLToGallon() {
        double gallon = L/3.785;
        return round(gallon, 10);
    }

    public double convertGallonToL() {
        double L = gallon*3.785;
        return round(L, 10);
    }

//  ________________________________________________

    public double convertLToPint() {
        double pint = L*2.11338;
        return round(pint, 10);
    }

    public double convertPintToL() {
        double L = pint/2.11338;
        return round(L, 10);
    }

//  __________________________________________________

    public double convertLToQuart() {
        double quart = L*1.05669;
        return round(quart, 10);
    }

    public double convertQuartToL() {
        double L = quart/1.05669;
        return round(L, 10);
    }

//  __________________________________________________

    public double convertLToBarrel() {
        double barrel = L/159;
        return round(barrel, 10);
    }

    public double convertBarrelToL() {
        double L = barrel*159;
        return round(L, 10);
    }

//  __________________________________________________

    public double convertLToCubicFoot() {
        double cubicFoot = L/28.317;
        return round(cubicFoot, 10);
    }

    public double convertCubicFootToL() {
        double L = cubicFoot*28.317;
        return round(L, 10);
    }

//  __________________________________________________

    public double convertLToCubicInch() {
        double cubicInch = L*61.024;
        return round(cubicInch, 10);
    }

    public double convertCubicInchToL() {
        double L = cubicInch/61.024;
        return round(L, 10);
    }

}
