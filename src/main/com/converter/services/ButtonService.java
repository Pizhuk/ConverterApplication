package main.com.converter.services;

import main.com.converter.categoriesOfConversation.*;

public class ButtonService {
    ExtraServices extraServices = new ExtraServices();
    public String launchButton(String str, String method){
        String res = "";

//----------------------------------LENGTH-----------------------------------------

        if (method.equalsIgnoreCase("convertMToKm")){
            Length length = new Length();
            if(extraServices.IsDouble(str) == true){
                length.meters = Double.parseDouble(str);
                res = "Answer: "+ length.convertMToKm();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertKmToM")) {
            Length length = new Length();
            if(extraServices.IsDouble(str) == true){
                length.kilometers = Double.parseDouble(str);
                res = "Answer: "+ length.convertKmToM();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertMToMile")) {
            Length length = new Length();
            if(extraServices.IsDouble(str) == true){
                length.meters = Double.parseDouble(str);
                res = "Answer: "+ length.convertMToMile();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertMileToM")) {
            Length length = new Length();
            if(extraServices.IsDouble(str) == true){
                length.miles = Double.parseDouble(str);
                res = "Answer: "+ length.convertMileToM();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertMToNauticalMile")) {
            Length length = new Length();
            if(extraServices.IsDouble(str) == true){
                length.meters = Double.parseDouble(str);
                res = "Answer: "+ length.convertMToNauticalMile();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertNauticalMileToM")) {
            Length length = new Length();
            if(extraServices.IsDouble(str) == true){
                length.nauticalMiles = Double.parseDouble(str);
                res = "Answer: "+ length.convertNauticalMileToM();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertMToCable")) {
            Length length = new Length();
            if(extraServices.IsDouble(str) == true){
                length.meters = Double.parseDouble(str);
                res = "Answer: "+ length.convertMToCable();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertCableToM")) {
            Length length = new Length();
            if(extraServices.IsDouble(str) == true){
                length.cables = Double.parseDouble(str);
                res = "Answer: "+ length.convertCableToM();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertMToLeague")) {
            Length length = new Length();
            if(extraServices.IsDouble(str) == true){
                length.meters = Double.parseDouble(str);
                res = "Answer: "+ length.convertMToLeague();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertLeagueToM")) {
            Length length = new Length();
            if(extraServices.IsDouble(str) == true){
                length.leagues = Double.parseDouble(str);
                res = "Answer: "+ length.convertLeagueToM();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertMToFoot")) {
            Length length = new Length();
            if(extraServices.IsDouble(str) == true){
                length.meters = Double.parseDouble(str);
                res = "Answer: "+ length.convertMToFoot();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertFootToM")) {
            Length length = new Length();
            if(extraServices.IsDouble(str) == true){
                length.feet = Double.parseDouble(str);
                res = "Answer: "+ length.convertFootToM();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertMToYard")) {
            Length length = new Length();
            if(extraServices.IsDouble(str) == true){
                length.meters = Double.parseDouble(str);
                res = "Answer: "+ length.convertMToYard();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertYardToM")) {
            Length length = new Length();
            if(extraServices.IsDouble(str) == true){
                length.yards = Double.parseDouble(str);
                res = "Answer: "+ length.convertYardToM();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }


        //----------------------------------TEMPERATURE-----------------------------------------

        else if(method.equalsIgnoreCase("convertCToKelvin")) {
            Temperature temperature = new Temperature();
            if(extraServices.IsDoubleWithMinus(str) == true){
                temperature.C = Double.parseDouble(str);
                res = "Answer: "+ temperature.convertCToKelvin();
            }
            else if(extraServices.IsDoubleWithMinus(str) == false){
                res = "Here should be double or integer";
            }
        }

        else if(method.equalsIgnoreCase("convertKelvinToC")) {
            Temperature temperature = new Temperature();
            if(extraServices.IsDoubleWithMinus(str) == true){
                temperature.kelvin = Double.parseDouble(str);
                res = "Answer: "+ temperature.convertKelvinToC();
            }
            else if(extraServices.IsDoubleWithMinus(str) == false){
                res = "Here should be double or integer";
            }
        }

        else if(method.equalsIgnoreCase("convertCToFarenheit")) {
            Temperature temperature = new Temperature();
            if(extraServices.IsDoubleWithMinus(str) == true){
                temperature.C = Double.parseDouble(str);
                res = "Answer: "+ temperature.convertCToFarenheit();
            }
            else if(extraServices.IsDoubleWithMinus(str) == false){
                res = "Here should be double or integer";
            }
        }

        else if(method.equalsIgnoreCase("convertFarenheitToC")) {
            Temperature temperature = new Temperature();
            if(extraServices.IsDoubleWithMinus(str) == true){
                temperature.farenheit = Double.parseDouble(str);
                res = "Answer: "+ temperature.convertFarenheitToC();
            }
            else if(extraServices.IsDoubleWithMinus(str) == false){
                res = "Here should be double or integer";
            }
        }

        else if(method.equalsIgnoreCase("convertCToReomur")) {
            Temperature temperature = new Temperature();
            if(extraServices.IsDoubleWithMinus(str) == true){
                temperature.C = Double.parseDouble(str);
                res = "Answer: "+ temperature.convertCToReomur();
            }
            else if(extraServices.IsDoubleWithMinus(str) == false){
                res = "Here should be double or integer";
            }
        }

        else if(method.equalsIgnoreCase("convertReomurToC")) {
            Temperature temperature = new Temperature();
            if(extraServices.IsDoubleWithMinus(str) == true){
                temperature.reomur = Double.parseDouble(str);
                res = "Answer: "+ temperature.convertReomurToC();
            }
            else if(extraServices.IsDoubleWithMinus(str) == false){
                res = "Here should be double or integer";
            }
        }

        else if(method.equalsIgnoreCase("convertCToRemer")) {
            Temperature temperature = new Temperature();
            if(extraServices.IsDoubleWithMinus(str) == true){
                temperature.C = Double.parseDouble(str);
                res = "Answer: "+ temperature.convertCToRemer();
            }
            else if(extraServices.IsDoubleWithMinus(str) == false){
                res = "Here should be double or integer";
            }
        }

        else if(method.equalsIgnoreCase("convertRemerToC")) {
            Temperature temperature = new Temperature();
            if(extraServices.IsDoubleWithMinus(str) == true){
                temperature.remer = Double.parseDouble(str);
                res = "Answer: "+ temperature.convertRemerToC();
            }
            else if(extraServices.IsDoubleWithMinus(str) == false){
                res = "Here should be double or integer";
            }
        }

        else if(method.equalsIgnoreCase("convertCToRankin")) {
            Temperature temperature = new Temperature();
            if(extraServices.IsDoubleWithMinus(str) == true){
                temperature.C = Double.parseDouble(str);
                res = "Answer: "+ temperature.convertCToRankin();
            }
            else if(extraServices.IsDoubleWithMinus(str) == false){
                res = "Here should be double or integer";
            }
        }

        else if(method.equalsIgnoreCase("convertRankinToC")) {
            Temperature temperature = new Temperature();
            if(extraServices.IsDoubleWithMinus(str) == true){
                temperature.rankin = Double.parseDouble(str);
                res = "Answer: "+ temperature.convertRankinToC();
            }
            else if(extraServices.IsDoubleWithMinus(str) == false){
                res = "Here should be double or integer";
            }
        }

        else if(method.equalsIgnoreCase("convertCToNewton")) {
            Temperature temperature = new Temperature();
            if(extraServices.IsDoubleWithMinus(str) == true){
                temperature.C = Double.parseDouble(str);
                res = "Answer: "+ temperature.convertCToNewton();
            }
            else if(extraServices.IsDoubleWithMinus(str) == false){
                res = "Here should be double or integer";
            }
        }

        else if(method.equalsIgnoreCase("convertNewtonToC")) {
            Temperature temperature = new Temperature();
            if(extraServices.IsDoubleWithMinus(str) == true){
                temperature.newton = Double.parseDouble(str);
                res = "Answer: "+ temperature.convertNewtonToC();
            }
            else if(extraServices.IsDoubleWithMinus(str) == false){
                res = "Here should be double or integer";
            }
        }

        else if(method.equalsIgnoreCase("convertCToDelil")) {
            Temperature temperature = new Temperature();
            if(extraServices.IsDoubleWithMinus(str) == true){
                temperature.C = Double.parseDouble(str);
                res = "Answer: "+ temperature.convertCToDelil();
            }
            else if(extraServices.IsDoubleWithMinus(str) == false){
                res = "Here should be double or integer";
            }
        }

        else if(method.equalsIgnoreCase("convertDelilToC")) {
            Temperature temperature = new Temperature();
            if(extraServices.IsDoubleWithMinus(str) == true){
                temperature.delil = Double.parseDouble(str);
                res = "Answer: "+ temperature.convertDelilToC();
            }
            else if(extraServices.IsDoubleWithMinus(str) == false){
                res = "Here should be double or integer";
            }
        }

        //----------------------------------TIME-----------------------------------------

        else if(method.equalsIgnoreCase("convertSecToMin")) {
            Time time = new Time();
            if(extraServices.IsDouble(str) == true){
                time.sec = Double.parseDouble(str);
                res = "Answer: "+ time.convertSecToMin();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertMinToSec")) {
            Time time = new Time();
            if(extraServices.IsDouble(str) == true){
                time.min = Double.parseDouble(str);
                res = "Answer: "+ time.convertMinToSec();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertSecToHour")) {
            Time time = new Time();
            if(extraServices.IsDouble(str) == true){
                time.sec = Double.parseDouble(str);
                res = "Answer: "+ time.convertSecToHour();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertHourToSec")) {
            Time time = new Time();
            if(extraServices.IsDouble(str) == true){
                time.hour = Double.parseDouble(str);
                res = "Answer: "+ time.convertHourToSec();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertSecToDay")) {
            Time time = new Time();
            if(extraServices.IsDouble(str) == true){
                time.sec = Double.parseDouble(str);
                res = "Answer: "+ time.convertSecToDay();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertDayToSec")) {
            Time time = new Time();
            if(extraServices.IsDouble(str) == true){
                time.day = Double.parseDouble(str);
                res = "Answer: "+ time.convertDayToSec();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertSecToWeek")) {
            Time time = new Time();
            if(extraServices.IsDouble(str) == true){
                time.sec = Double.parseDouble(str);
                res = "Answer: "+ time.convertSecToWeek();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertWeekToSec")) {
            Time time = new Time();
            if(extraServices.IsDouble(str) == true){
                time.week = Double.parseDouble(str);
                res = "Answer: "+ time.convertWeekToSec();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertSecToMonth")) {
            Time time = new Time();
            if(extraServices.IsDouble(str) == true){
                time.sec = Double.parseDouble(str);
                res = "Answer: "+ time.convertSecToMonth();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertMonthToSec")) {
            Time time = new Time();
            if(extraServices.IsDouble(str) == true){
                time.month = Double.parseDouble(str);
                res = "Answer: "+ time.convertMonthToSec();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertSecToYear")) {
            Time time = new Time();
            if(extraServices.IsDouble(str) == true){
                time.sec = Double.parseDouble(str);
                res = "Answer: "+ time.convertSecToYear();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertYearToSec")) {
            Time time = new Time();
            if(extraServices.IsDouble(str) == true){
                time.year = Double.parseDouble(str);
                res = "Answer: "+ time.convertYearToSec();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        //----------------------------------VOLUME-----------------------------------------

        else if(method.equalsIgnoreCase("convertLToCubicMetre")) {
            Volume volume = new Volume();
            if(extraServices.IsDouble(str) == true){
                volume.L = Double.parseDouble(str);
                res = "Answer: "+ volume.convertLToCubicMetre();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertCubicMetreToL")) {
            Volume volume = new Volume();
            if(extraServices.IsDouble(str) == true){
                volume.cubicMetre = Double.parseDouble(str);
                res = "Answer: "+ volume.convertCubicMetreToL();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertLToGallon")) {
            Volume volume = new Volume();
            if(extraServices.IsDouble(str) == true){
                volume.L = Double.parseDouble(str);
                res = "Answer: "+ volume.convertLToGallon();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertGallonToL")) {
            Volume volume = new Volume();
            if(extraServices.IsDouble(str) == true){
                volume.gallon = Double.parseDouble(str);
                res = "Answer: "+ volume.convertGallonToL();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertLToPint")) {
            Volume volume = new Volume();
            if(extraServices.IsDouble(str) == true){
                volume.L = Double.parseDouble(str);
                res = "Answer: "+ volume.convertLToPint();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertPintToL")) {
            Volume volume = new Volume();
            if(extraServices.IsDouble(str) == true){
                volume.pint = Double.parseDouble(str);
                res = "Answer: "+ volume.convertPintToL();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertLToQuart")) {
            Volume volume = new Volume();
            if(extraServices.IsDouble(str) == true){
                volume.L = Double.parseDouble(str);
                res = "Answer: "+ volume.convertLToQuart();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertQuartToL")) {
            Volume volume = new Volume();
            if(extraServices.IsDouble(str) == true){
                volume.quart = Double.parseDouble(str);
                res = "Answer: "+ volume.convertQuartToL();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertLToBarrel")) {
            Volume volume = new Volume();
            if(extraServices.IsDouble(str) == true){
                volume.L = Double.parseDouble(str);
                res = "Answer: "+ volume.convertLToBarrel();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertBarrelToL")) {
            Volume volume = new Volume();
            if(extraServices.IsDouble(str) == true){
                volume.barrel = Double.parseDouble(str);
                res = "Answer: "+ volume.convertBarrelToL();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertLToCubicFoot")) {
            Volume volume = new Volume();
            if(extraServices.IsDouble(str) == true){
                volume.L = Double.parseDouble(str);
                res = "Answer: "+ volume.convertLToCubicFoot();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertCubicFootToL")) {
            Volume volume = new Volume();
            if(extraServices.IsDouble(str) == true){
                volume.cubicFoot = Double.parseDouble(str);
                res = "Answer: "+ volume.convertCubicFootToL();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertLToCubicInch")) {
            Volume volume = new Volume();
            if(extraServices.IsDouble(str) == true){
                volume.L = Double.parseDouble(str);
                res = "Answer: "+ volume.convertLToCubicInch();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertCubicInchToL")) {
            Volume volume = new Volume();
            if(extraServices.IsDouble(str) == true){
                volume.cubicInch = Double.parseDouble(str);
                res = "Answer: "+ volume.convertCubicInchToL();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        //----------------------------------WEIGHT-----------------------------------------

        else if(method.equalsIgnoreCase("convertKgToGram")) {
            Weight weight = new Weight();
            if(extraServices.IsDouble(str) == true){
                weight.kg = Double.parseDouble(str);
                res = "Answer: "+ weight.convertKgToGram();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertGramToKg")) {
            Weight weight = new Weight();
            if(extraServices.IsDouble(str) == true){
                weight.gram = Double.parseDouble(str);
                res = "Answer: "+ weight.convertGramToKg();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertKgToCarat")) {
            Weight weight = new Weight();
            if(extraServices.IsDouble(str) == true){
                weight.kg = Double.parseDouble(str);
                res = "Answer: "+ weight.convertKgToCarat();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertCaratToKg")) {
            Weight weight = new Weight();
            if(extraServices.IsDouble(str) == true){
                weight.carat = Double.parseDouble(str);
                res = "Answer: "+ weight.convertCaratToKg();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertKgToEngPound")) {
            Weight weight = new Weight();
            if(extraServices.IsDouble(str) == true){
                weight.kg = Double.parseDouble(str);
                res = "Answer: "+ weight.convertKgToEngPound();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertEngPoundToKg")) {
            Weight weight = new Weight();
            if(extraServices.IsDouble(str) == true){
                weight.engPound = Double.parseDouble(str);
                res = "Answer: "+ weight.convertEngPoundToKg();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertKgToPound")) {
            Weight weight = new Weight();
            if(extraServices.IsDouble(str) == true){
                weight.kg = Double.parseDouble(str);
                res = "Answer: "+ weight.convertKgToPound();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertPoundToKg")) {
            Weight weight = new Weight();
            if(extraServices.IsDouble(str) == true){
                weight.pound = Double.parseDouble(str);
                res = "Answer: "+ weight.convertPoundToKg();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertKgToStone")) {
            Weight weight = new Weight();
            if(extraServices.IsDouble(str) == true){
                weight.kg = Double.parseDouble(str);
                res = "Answer: "+ weight.convertKgToStone();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertStoneToKg")) {
            Weight weight = new Weight();
            if(extraServices.IsDouble(str) == true){
                weight.stone = Double.parseDouble(str);
                res = "Answer: "+ weight.convertStoneToKg();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertKgToRusFunt")) {
            Weight weight = new Weight();
            if(extraServices.IsDouble(str) == true){
                weight.kg = Double.parseDouble(str);
                res = "Answer: "+ weight.convertKgToRusFunt();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        else if(method.equalsIgnoreCase("convertRusFuntToKg")) {
            Weight weight = new Weight();
            if(extraServices.IsDouble(str) == true){
                weight.rusFunt = Double.parseDouble(str);
                res = "Answer: "+ weight.convertRusFuntToKg();
            }
            else if(extraServices.IsDouble(str) == false){
                res = "Here should be double or integer, and cannot be a negative number";
            }
        }

        return res;
    }
}
