package main.com.converter.categoriesOfConversation;

public class Temperature {
    public double C;
    public double kelvin;
    public double farenheit;
    public double reomur;
    public double remer;
    public double rankin;
    public double newton;
    public double delil;

    public double round(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    public double convertCToKelvin() {
        double kelvin = C+273.15;
        return round(kelvin, 10);
    }

    public double convertKelvinToC() {
        double C = kelvin-273.15;
        return round(C, 10);
    }

//    __________________________________________________

    public double convertCToFarenheit() {
        double farenheit = C*1.8+32;
        return round(farenheit, 10);
    }

    public double convertFarenheitToC() {
        double C = (farenheit - 32)/1.8;
        return round(C, 10);
    }

//  _____________________________________________________

    public double convertCToReomur() {
        double reomur = C*0.8;
        return round(reomur, 10);
    }

    public double convertReomurToC() {

        double C = reomur/0.8;
        return round(C, 10);
    }

//  ______________________________________________________


    public double convertCToRemer() {
        double remer = C*0.525+7.5;
        return round(remer, 10);
    }

    public double convertRemerToC() {
        double C = (remer - 7.5)/0.525;
        return round(C, 10);
    }

//  _______________________________________________________

    public double convertCToRankin() {
        double rankin = C*1.8+491.47;
        return round(rankin, 10);
    }

    public double convertRankinToC() {
        double C = (rankin - 491.47)/1.8;
        return round(C, 10);
    }

//  _______________________________________________________

    public double convertCToNewton() {
        double newton = C*0.33;
        return round(newton, 10);
    }

    public double convertNewtonToC() {
        double C = newton/0.33;
        return round(C, 10);
    }

//  _______________________________________________________

    public double convertCToDelil() {
        double delil = (100 - C)*1.5;
        return round(delil, 10);
    }

    public double convertDelilToC() {
        double C = -((delil/1.5)-100);
        return round(C, 10);
    }

}
