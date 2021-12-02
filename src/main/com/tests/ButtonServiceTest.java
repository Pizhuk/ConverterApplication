package main.com.tests;

import main.com.converter.services.ButtonService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class ButtonServiceTest {
    ButtonService buttonServiceCut = new ButtonService();
    static List<Arguments> launchButtonTestArgs(){
        return List.of(
//              ----------------------------LENGTH--------------------------------
                Arguments.arguments("1300", "convertMToKm", "Answer: 1.3"),
                Arguments.arguments("1300f", "convertMToKm", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("2", "convertKmToM", "Answer: 2000.0"),
                Arguments.arguments("-2", "convertKmToM", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("3218", "convertMToMile", "Answer: 2.0"),
                Arguments.arguments("3218$", "convertMToMile", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("2.3", "convertMileToM", "Answer: 3700.7"),
                Arguments.arguments("2.3/", "convertMileToM", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("4630", "convertMToNauticalMile", "Answer: 2.5"),
                Arguments.arguments("4630)", "convertMToNauticalMile", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("1.2", "convertNauticalMileToM", "Answer: 2222.4"),
                Arguments.arguments(" ", "convertMToNauticalMile", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("574.12", "convertMToCable", "Answer: 3.1"),
                Arguments.arguments("574.12*", "convertMToCable", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("2.11", "convertCableToM", "Answer: 390.772"),
                Arguments.arguments("-0", "convertCableToM", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("6111.6", "convertMToLeague", "Answer: 1.1"),
                Arguments.arguments("", "convertMToLeague", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("6", "convertLeagueToM", "Answer: 33336.0"),
                Arguments.arguments("6+", "convertLeagueToM", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("33", "convertMToFoot", "Answer: 108.273"),
                Arguments.arguments("33#", "convertMToFoot", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("3.281", "convertFootToM", "Answer: 1.0"),
                Arguments.arguments("3,281", "convertFootToM", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("12", "convertMToYard", "Answer: 13.12332"),
                Arguments.arguments("12,", "convertMToYard", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("2.296581", "convertYardToM", "Answer: 2.1"),
                Arguments.arguments("2.296581O", "convertYardToM", "Here should be double or integer, and cannot be a negative number"),

//              -----------------------------TEMPERATURE--------------------------------
                Arguments.arguments("1", "convertCToKelvin", "Answer: 274.15"),
                Arguments.arguments("1,", "convertCToKelvin", "Here should be double or integer"),
                Arguments.arguments("273.15", "convertKelvinToC", "Answer: 0.0"),
                Arguments.arguments("273.15=-", "convertKelvinToC", "Here should be double or integer"),
                Arguments.arguments("1", "convertCToFarenheit", "Answer: 33.8"),
                Arguments.arguments("1\\", "convertCToFarenheit", "Here should be double or integer"),
                Arguments.arguments("32", "convertFarenheitToC", "Answer: 0.0"),
                Arguments.arguments("o-", "convertFarenheitToC", "Here should be double or integer"),
                Arguments.arguments("2.3", "convertCToReomur", "Answer: 1.84"),
                Arguments.arguments("0.1,1", "convertCToReomur", "Here should be double or integer"),
                Arguments.arguments("-3.2", "convertReomurToC", "Answer: -4.0"),
                Arguments.arguments("-12,", "convertReomurToC", "Here should be double or integer"),
                Arguments.arguments("1.1", "convertCToRemer", "Answer: 8.0775"),
                Arguments.arguments("@1", "convertCToRemer", "Here should be double or integer"),
                Arguments.arguments("-3", "convertRemerToC", "Answer: -20.0"),
                Arguments.arguments("-12,+", "convertRemerToC", "Here should be double or integer"),
                Arguments.arguments("0.25", "convertCToRankin", "Answer: 491.92"),
                Arguments.arguments("-123$", "convertCToRankin", "Here should be double or integer"),
                Arguments.arguments("-0.9", "convertRankinToC", "Answer: -273.5388888889"),
                Arguments.arguments("-", "convertRankinToC", "Here should be double or integer"),
                Arguments.arguments("-100", "convertCToNewton", "Answer: -33.0"),
                Arguments.arguments("100=", "convertCToNewton", "Here should be double or integer"),
                Arguments.arguments("0.9", "convertNewtonToC", "Answer: 2.7272727273"),
                Arguments.arguments("-", "convertNewtonToC", "Here should be double or integer"),
                Arguments.arguments("99", "convertCToDelil", "Answer: 1.5"),
                Arguments.arguments("100=", "convertCToDelil", "Here should be double or integer"),
                Arguments.arguments("-3", "convertDelilToC", "Answer: 102.0"),
                Arguments.arguments("-", "convertDelilToC", "Here should be double or integer"),

//              -----------------------------TIME--------------------------------
                Arguments.arguments("90", "convertSecToMin", "Answer: 1.5"),
                Arguments.arguments("-12,", "convertSecToMin", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("1", "convertMinToSec", "Answer: 60.0"),
                Arguments.arguments("2.29;", "convertMinToSec", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("7200", "convertSecToHour", "Answer: 2.0"),
                Arguments.arguments("-12", "convertSecToHour", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("1.5", "convertHourToSec", "Answer: 5400.0"),
                Arguments.arguments("2.29;", "convertHourToSec", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("10000", "convertSecToDay", "Answer: 0.1157407407"),
                Arguments.arguments("-1", "convertSecToDay", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("2.3", "convertDayToSec", "Answer: 198720.0"),
                Arguments.arguments("2.29;", "convertDayToSec", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("2654", "convertSecToWeek", "Answer: 0.0043882275"),
                Arguments.arguments("-12-", "convertSecToWeek", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("0.3", "convertWeekToSec", "Answer: 181440.0"),
                Arguments.arguments("2.29=;", "convertWeekToSec", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("6254788", "convertSecToMonth", "Answer: 2.3800537083"),
                Arguments.arguments("-12-", "convertSecToMonth", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("1", "convertMonthToSec", "Answer: 2628002.88"),
                Arguments.arguments("2=;", "convertMonthToSec", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("194116928", "convertSecToYear", "Answer: 6.1554074074"),
                Arguments.arguments("", "convertSecToYear", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("0.1", "convertYearToSec", "Answer: 3153600.0"),
                Arguments.arguments("-2", "convertYearToSec", "Here should be double or integer, and cannot be a negative number"),

//              -----------------------------VOLUME--------------------------------
                Arguments.arguments("2430", "convertLToCubicMetre", "Answer: 2.43"),
                Arguments.arguments("23%", "convertLToCubicMetre", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("0.89", "convertCubicMetreToL", "Answer: 890.0"),
                Arguments.arguments("-20.12", "convertCubicMetreToL", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("9.6", "convertLToGallon", "Answer: 2.536327609"),
                Arguments.arguments("3*", "convertLToGallon", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("1.45", "convertGallonToL", "Answer: 5.48825"),
                Arguments.arguments("-$#", "convertGallonToL", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("1.36", "convertLToPint", "Answer: 2.8741968"),
                Arguments.arguments(":", "convertLToPint", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("3.6", "convertPintToL", "Answer: 1.7034324163"),
                Arguments.arguments("-3.6", "convertPintToL", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("2.113", "convertLToQuart", "Answer: 2.23278597"),
                Arguments.arguments("[]", "convertLToQuart", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("7.5", "convertQuartToL", "Answer: 7.097635068"),
                Arguments.arguments("-[3.6]", "convertQuartToL", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("508.8", "convertLToBarrel", "Answer: 3.2"),
                Arguments.arguments("[0.09", "convertLToBarrel", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("0.1", "convertBarrelToL", "Answer: 15.9"),
                Arguments.arguments("+3.6]", "convertBarrelToL", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("7.07925", "convertLToCubicFoot", "Answer: 0.25"),
                Arguments.arguments("***", "convertLToCubicFoot", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("1.005", "convertCubicFootToL", "Answer: 28.458585"),
                Arguments.arguments(")-l", "convertCubicFootToL", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("0.035", "convertLToCubicInch", "Answer: 2.13584"),
                Arguments.arguments("*90.78", "convertLToCubicInch", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("122", "convertCubicInchToL", "Answer: 1.9992134242"),
                Arguments.arguments("o99", "convertCubicInchToL", "Here should be double or integer, and cannot be a negative number"),

//              -----------------------------WEIGHT--------------------------------

                Arguments.arguments("1.2", "convertKgToGram", "Answer: 1200.0"),
                Arguments.arguments("1,2", "convertLToCubicInch", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("3200", "convertGramToKg", "Answer: 3.2"),
                Arguments.arguments("O.10", "convertCubicInchToL", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("2.3", "convertKgToCarat", "Answer: 11500.0"),
                Arguments.arguments("1,2", "convertKgToCarat", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("10000", "convertCaratToKg", "Answer: 2.0"),
                Arguments.arguments("^^^", "convertCaratToKg", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("9.3", "convertKgToEngPound", "Answer: 4.2184140578"),
                Arguments.arguments(".)", "convertKgToEngPound", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("0", "convertEngPoundToKg", "Answer: 0.0"),
                Arguments.arguments("^^^!", "convertEngPoundToKg", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("4.5", "convertKgToPound", "Answer: 9.92079"),
                Arguments.arguments(".", "convertKgToPound", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("6", "convertPoundToKg", "Answer: 2.7215574566"),
                Arguments.arguments("+-", "convertPoundToKg", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("12.7", "convertKgToStone", "Answer: 2.0"),
                Arguments.arguments(".)", "convertKgToStone", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("0.45", "convertStoneToKg", "Answer: 2.8575"),
                Arguments.arguments("/as", "convertStoneToKg", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("1.003", "convertKgToRusFunt", "Answer: 2.4492257"),
                Arguments.arguments("жд", "convertKgToRusFunt", "Here should be double or integer, and cannot be a negative number"),
                Arguments.arguments("7.81408", "convertRusFuntToKg", "Answer: 3.2"),
                Arguments.arguments("@&", "convertRusFuntToKg", "Here should be double or integer, and cannot be a negative number")


                );
    }

    @ParameterizedTest
    @MethodSource("launchButtonTestArgs")
    void launchButtonTest(String str, String method, String expected){
        String actual = buttonServiceCut.launchButton(str, method);
        Assertions.assertEquals(expected, actual);
    }
}
