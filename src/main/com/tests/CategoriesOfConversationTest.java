package main.com.tests;

import main.com.converter.categoriesOfConversation.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class CategoriesOfConversationTest {

//  ---------------------------LENGTH------------------------------


    Length lengthCut = new Length();

    static List<Arguments> convertMToKmTestArgs(){
        return List.of(
                Arguments.arguments(12, 0.012),
                Arguments.arguments(11500, 11.5)
        );
    }

    @ParameterizedTest
    @MethodSource("convertMToKmTestArgs")
    void convertMToKmTest(double meters, double expected){
        lengthCut.meters = meters;
        double actual = lengthCut.convertMToKm();
        Assertions.assertEquals(expected, actual);
    }


    static List<Arguments> convertKmToMTestArgs(){
        return List.of(
                Arguments.arguments(12, 12000),
                Arguments.arguments(11.5, 11500)
        );
    }

    @ParameterizedTest
    @MethodSource("convertKmToMTestArgs")
    void convertKmToMTest(double kilometers, double expected){
        lengthCut.kilometers = kilometers;
        double actual = lengthCut.convertKmToM();
        Assertions.assertEquals(expected, actual);
    }

//  ____________________________________________________

    static List<Arguments> convertMToMileTestArgs(){
        return List.of(
                Arguments.arguments(3218, 2),
                Arguments.arguments(3700.7, 2.3)
        );
    }

    @ParameterizedTest
    @MethodSource("convertMToMileTestArgs")
    void convertMToMileTest(double meters, double expected){
        lengthCut.meters = meters;
        double actual = lengthCut.convertMToMile();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertMileToMTestArgs(){
        return List.of(
                Arguments.arguments(13, 20917),
                Arguments.arguments(3.7, 5953.3)
        );
    }

    @ParameterizedTest
    @MethodSource("convertMileToMTestArgs")
    void convertMileToMTest(double miles, double expected){
        lengthCut.miles = miles;
        double actual = lengthCut.convertMileToM();
        Assertions.assertEquals(expected, actual);
    }

//  ___________________________________________________________

    static List<Arguments> convertMToNauticalMileTestArgs(){
        return List.of(
                Arguments.arguments(11112, 6),
                Arguments.arguments(3461.388, 1.869)
        );
    }

    @ParameterizedTest
    @MethodSource("convertMToNauticalMileTestArgs")
    void convertMToNauticalMileTest(double meters, double expected){
        lengthCut.meters = meters;
        double actual = lengthCut.convertMToNauticalMile();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertNauticalMileToMTestArgs(){
        return List.of(
                Arguments.arguments(1, 1852),
                Arguments.arguments(3.7, 6852.4)
        );
    }

    @ParameterizedTest
    @MethodSource("convertNauticalMileToMTestArgs")
    void convertNauticalMileToMTest(double nauticalMiles, double expected){
        lengthCut.nauticalMiles = nauticalMiles;
        double actual = lengthCut.convertNauticalMileToM();
        Assertions.assertEquals(expected, actual);
    }

//  _______________________________________________________________________

    static List<Arguments> convertMToCableTestArgs(){
        return List.of(
                Arguments.arguments(9, 0.0485961123),
                Arguments.arguments(425.96, 2.3)
        );
    }

    @ParameterizedTest
    @MethodSource("convertMToCableTestArgs")
    void convertMToCableTest(double meters, double expected){
        lengthCut.meters = meters;
        double actual = lengthCut.convertMToCable();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertCableToMTestArgs(){
        return List.of(
                Arguments.arguments(9.3, 1722.36),
                Arguments.arguments(3, 555.6)
        );
    }

    @ParameterizedTest
    @MethodSource("convertCableToMTestArgs")
    void convertCableToMToMTest(double cables, double expected){
        lengthCut.cables = cables;
        double actual = lengthCut.convertCableToM();
        Assertions.assertEquals(expected, actual);
    }

//  ________________________________________________________________

    static List<Arguments> convertMToLeagueTestArgs(){
        return List.of(
                Arguments.arguments(1, 0.0001799856),
                Arguments.arguments(85.6, 0.0154067675)
        );
    }

    @ParameterizedTest
    @MethodSource("convertMToLeagueTestArgs")
    void convertMToLeagueTest(double meters, double expected){
        lengthCut.meters = meters;
        double actual = lengthCut.convertMToLeague();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertLeagueToMTestArgs(){
        return List.of(
                Arguments.arguments(49.46, 274799.76),
                Arguments.arguments(3, 16668)
        );
    }

    @ParameterizedTest
    @MethodSource("convertLeagueToMTestArgs")
    void convertLeagueToMToMTest(double leagues, double expected){
        lengthCut.leagues = leagues;
        double actual = lengthCut.convertLeagueToM();
        Assertions.assertEquals(expected, actual);
    }

//  __________________________________________________________________

    static List<Arguments> convertMToFootTestArgs(){
        return List.of(
                Arguments.arguments(12, 39.372),
                Arguments.arguments(19.53, 64.07793)
        );
    }

    @ParameterizedTest
    @MethodSource("convertMToFootTestArgs")
    void convertMToFootTest(double meters, double expected){
        lengthCut.meters = meters;
        double actual = lengthCut.convertMToFoot();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertFootToMTestArgs(){
        return List.of(
                Arguments.arguments(6.21, 1.8927156355),
                Arguments.arguments(6.562, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("convertFootToMTestArgs")
    void convertFootToMToMTest(double feet, double expected){
        lengthCut.feet = feet;
        double actual = lengthCut.convertFootToM();
        Assertions.assertEquals(expected, actual);
    }

//  _____________________________________________________________

    static List<Arguments> convertMToYardTestArgs(){
        return List.of(
                Arguments.arguments(1.3, 1.421693),
                Arguments.arguments(6, 6.56166)
        );
    }

    @ParameterizedTest
    @MethodSource("convertMToYardTestArgs")
    void convertMToYardTest(double meters, double expected){
        lengthCut.meters = meters;
        double actual = lengthCut.convertMToYard();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertYardToMTestArgs(){
        return List.of(
                Arguments.arguments(14, 12.8016386097),
                Arguments.arguments(6.4, 5.8521776502)
        );
    }

    @ParameterizedTest
    @MethodSource("convertYardToMTestArgs")
    void convertYardToMToMTest(double yards, double expected){
        lengthCut.yards = yards;
        double actual = lengthCut.convertYardToM();
        Assertions.assertEquals(expected, actual);
    }

    //  ---------------------------TEMPERATURE------------------------------


    Temperature temperatureCut = new Temperature();

    static List<Arguments> convertCToKelvinTestArgs(){
        return List.of(
                Arguments.arguments(12, 285.15),
                Arguments.arguments(1.32, 274.47)
        );
    }

    @ParameterizedTest
    @MethodSource("convertCToKelvinTestArgs")
    void convertCToKelvinTest(double C, double expected){
        temperatureCut.C = C;
        double actual = temperatureCut.convertCToKelvin();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertKelvinToCTestArgs(){
        return List.of(
                Arguments.arguments(36, -237.15),
                Arguments.arguments(648.5, 375.35)
        );
    }

    @ParameterizedTest
    @MethodSource("convertKelvinToCTestArgs")
    void convertKelvinToCTest(double kelvin, double expected){
        temperatureCut.kelvin = kelvin;
        double actual = temperatureCut.convertKelvinToC();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertCToFarenheitTestArgs(){
        return List.of(
                Arguments.arguments(12, 53.6),
                Arguments.arguments(-19.2, -2.56)
        );
    }

    @ParameterizedTest
    @MethodSource("convertCToFarenheitTestArgs")
    void convertCToFarenheitTest(double C, double expected){
        temperatureCut.C = C;
        double actual = temperatureCut.convertCToFarenheit();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertFarenheitToCTestArgs(){
        return List.of(
                Arguments.arguments(69, 20.5555555556),
                Arguments.arguments(-0.9, -18.2777777778)
        );
    }

    @ParameterizedTest
    @MethodSource("convertFarenheitToCTestArgs")
    void convertFarenheitToCTest(double farenheit, double expected){
        temperatureCut.farenheit = farenheit;
        double actual = temperatureCut.convertFarenheitToC();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertCToReomurTestArgs(){
        return List.of(
                Arguments.arguments(4.3, 3.44),
                Arguments.arguments(-61, -48.8)
        );
    }

    @ParameterizedTest
    @MethodSource("convertCToReomurTestArgs")
    void convertCToReomurTest(double C, double expected){
        temperatureCut.C = C;
        double actual = temperatureCut.convertCToReomur();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertReomurToCTestArgs(){
        return List.of(
                Arguments.arguments(14.3, 17.875),
                Arguments.arguments(-3, -3.75)
        );
    }

    @ParameterizedTest
    @MethodSource("convertReomurToCTestArgs")
    void convertReomurToCTest(double reomur, double expected){
        temperatureCut.reomur = reomur;
        double actual = temperatureCut.convertReomurToC();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertCToRemerTestArgs(){
        return List.of(
                Arguments.arguments(26, 21.15),
                Arguments.arguments(-1.87926, 6.5133885)
        );
    }

    @ParameterizedTest
    @MethodSource("convertCToRemerTestArgs")
    void convertCToRemerTest(double C, double expected){
        temperatureCut.C = C;
        double actual = temperatureCut.convertCToRemer();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertRemerToCTestArgs(){
        return List.of(
                Arguments.arguments(77, 132.380952381),
                Arguments.arguments(-0.95, -16.0952380952)
        );
    }

    @ParameterizedTest
    @MethodSource("convertRemerToCTestArgs")
    void convertRemerToCTest(double remer, double expected){
        temperatureCut.remer = remer;
        double actual = temperatureCut.convertRemerToC();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertCToRankinTestArgs(){
        return List.of(
                Arguments.arguments(16, 520.27),
                Arguments.arguments(-66.66, 371.482)
        );
    }

    @ParameterizedTest
    @MethodSource("convertCToRankinTestArgs")
    void convertCToRankinTest(double C, double expected){
        temperatureCut.C = C;
        double actual = temperatureCut.convertCToRankin();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertRankinToCTestArgs(){
        return List.of(
                Arguments.arguments(493, 0.85),
                Arguments.arguments(-1000.03, -828.6111111111)
        );
    }

    @ParameterizedTest
    @MethodSource("convertRankinToCTestArgs")
    void convertRankinToCTest(double rankin, double expected){
        temperatureCut.rankin = rankin;
        double actual = temperatureCut.convertRankinToC();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertCToNewtonTestArgs(){
        return List.of(
                Arguments.arguments(100, 33),
                Arguments.arguments(-23.31, -7.6923)
        );
    }

    @ParameterizedTest
    @MethodSource("convertCToNewtonTestArgs")
    void convertCToNewtonTest(double C, double expected){
        temperatureCut.C = C;
        double actual = temperatureCut.convertCToNewton();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertNewtonToCTestArgs(){
        return List.of(
                Arguments.arguments(0.33, 1),
                Arguments.arguments(-90.9543, -275.6190909091)
        );
    }

    @ParameterizedTest
    @MethodSource("convertNewtonToCTestArgs")
    void convertNewtonToCTest(double newton, double expected){
        temperatureCut.newton = newton;
        double actual = temperatureCut.convertNewtonToC();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertCToDelilTestArgs(){
        return List.of(
                Arguments.arguments(37, 94.5),
                Arguments.arguments(-7.37, 161.055)
        );
    }

    @ParameterizedTest
    @MethodSource("convertCToDelilTestArgs")
    void convertCToDelilTest(double C, double expected){
        temperatureCut.C = C;
        double actual = temperatureCut.convertCToDelil();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertDelilToCTestArgs(){
        return List.of(
                Arguments.arguments(48, 68),
                Arguments.arguments(-3.96, 102.64)
        );
    }

    @ParameterizedTest
    @MethodSource("convertDelilToCTestArgs")
    void convertDelilToCTest(double delil, double expected){
        temperatureCut.delil = delil;
        double actual = temperatureCut.convertDelilToC();
        Assertions.assertEquals(expected, actual);
    }

    //  ---------------------------TIME------------------------------

    Time timeCut = new Time();

    static List<Arguments> convertSecToMinTestArgs(){
        return List.of(
                Arguments.arguments(90, 1.5),
                Arguments.arguments(30.6, 0.51)
        );
    }

    @ParameterizedTest
    @MethodSource("convertSecToMinTestArgs")
    void convertSecToMinTest(double sec, double expected){
        timeCut.sec = sec;
        double actual = timeCut.convertSecToMin();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertMinToSecTestArgs(){
        return List.of(
                Arguments.arguments(4, 240),
                Arguments.arguments(1.15, 69)
        );
    }

    @ParameterizedTest
    @MethodSource("convertMinToSecTestArgs")
    void convertMinToSecTest(double min, double expected){
        timeCut.min = min;
        double actual = timeCut.convertMinToSec();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertSecToHourTestArgs(){
        return List.of(
                Arguments.arguments(2900, 0.8055555556),
                Arguments.arguments(26.36, 0.0073222222)
        );
    }

    @ParameterizedTest
    @MethodSource("convertSecToHourTestArgs")
    void convertSecToHourTest(double sec, double expected){
        timeCut.sec = sec;
        double actual = timeCut.convertSecToHour();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertHourToSecTestArgs(){
        return List.of(
                Arguments.arguments(2, 7200),
                Arguments.arguments(6.93, 24948)
        );
    }

    @ParameterizedTest
    @MethodSource("convertHourToSecTestArgs")
    void convertHourToSecTest(double hour, double expected){
        timeCut.hour = hour;
        double actual = timeCut.convertHourToSec();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertSecToDayTestArgs(){
        return List.of(
                Arguments.arguments(965555, 11.1754050926),
                Arguments.arguments(13648.3645, 0.1579671817)
        );
    }

    @ParameterizedTest
    @MethodSource("convertSecToDayTestArgs")
    void convertSecToDayTest(double sec, double expected){
        timeCut.sec = sec;
        double actual = timeCut.convertSecToDay();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertDayToSecTestArgs(){
        return List.of(
                Arguments.arguments(11, 950400),
                Arguments.arguments(1.56, 134784)
        );
    }

    @ParameterizedTest
    @MethodSource("convertDayToSecTestArgs")
    void convertDayToSecTest(double day, double expected){
        timeCut.day = day;
        double actual = timeCut.convertDayToSec();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertSecToWeekTestArgs(){
        return List.of(
                Arguments.arguments(1, 0.0000016534),
                Arguments.arguments(3623265.6352, 5.9908492646)
        );
    }

    @ParameterizedTest
    @MethodSource("convertSecToWeekTestArgs")
    void convertSecToWeekTest(double sec, double expected){
        timeCut.sec = sec;
        double actual = timeCut.convertSecToWeek();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertWeekToSecTestArgs(){
        return List.of(
                Arguments.arguments(1.2, 725760),
                Arguments.arguments(6, 3628800)
        );
    }

    @ParameterizedTest
    @MethodSource("convertWeekToSecTestArgs")
    void convertWeekToSecTest(double week, double expected){
        timeCut.week = week;
        double actual = timeCut.convertWeekToSec();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertSecToMonthTestArgs(){
        return List.of(
                Arguments.arguments(9519581, 3.6223632297),
                Arguments.arguments(1.2, 0.0000004566)
        );
    }

    @ParameterizedTest
    @MethodSource("convertSecToMonthTestArgs")
    void convertSecToMonthTest(double sec, double expected){
        timeCut.sec = sec;
        double actual = timeCut.convertSecToMonth();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertMonthToSecTestArgs(){
        return List.of(
                Arguments.arguments(1, 2628002.88),
                Arguments.arguments(12.5, 32850036)
        );
    }

    @ParameterizedTest
    @MethodSource("convertMonthToSecTestArgs")
    void convertMonthToSecTest(double month, double expected){
        timeCut.month = month;
        double actual = timeCut.convertMonthToSec();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertSecToYearTestArgs(){
        return List.of(
                Arguments.arguments(92_092_092, 2.9202210807),
                Arguments.arguments(1.65, 0.0000000523)
        );
    }

    @ParameterizedTest
    @MethodSource("convertSecToYearTestArgs")
    void convertSecToYearTest(double sec, double expected){
        timeCut.sec = sec;
        double actual = timeCut.convertSecToYear();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertYearToSecTestArgs(){
        return List.of(
                Arguments.arguments(1, 31536000),
                Arguments.arguments(0.69, 21759840)
        );
    }

    @ParameterizedTest
    @MethodSource("convertYearToSecTestArgs")
    void convertYearToSecTest(double year, double expected){
        timeCut.year = year;
        double actual = timeCut.convertYearToSec();
        Assertions.assertEquals(expected, actual);
    }

    //  ---------------------------VOLUME-----------------------------


    Volume volumeCut = new Volume();

    static List<Arguments> convertLToCubicMetreTestArgs(){
        return List.of(
                Arguments.arguments(3600, 3.6),
                Arguments.arguments(1.62, 0.00162)
        );
    }

    @ParameterizedTest
    @MethodSource("convertLToCubicMetreTestArgs")
    void convertLToCubicMetreTest(double L, double expected){
        volumeCut.L = L;
        double actual = volumeCut.convertLToCubicMetre();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertCubicMetreToLTestArgs(){
        return List.of(
                Arguments.arguments(2.3, 2300),
                Arguments.arguments(19, 19000)
        );
    }

    @ParameterizedTest
    @MethodSource("convertCubicMetreToLTestArgs")
    void convertCubicMetreToLTest(double cubicMetre, double expected){
        volumeCut.cubicMetre = cubicMetre;
        double actual = volumeCut.convertCubicMetreToL();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertLToGallonTestArgs(){
        return List.of(
                Arguments.arguments(525, 138.7054161162),
                Arguments.arguments(5.3, 1.4002642008)
        );
    }

    @ParameterizedTest
    @MethodSource("convertLToGallonTestArgs")
    void convertLToGallonTest(double L, double expected){
        volumeCut.L = L;
        double actual = volumeCut.convertLToGallon();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertGallonToLTestArgs(){
        return List.of(
                Arguments.arguments(2, 7.57),
                Arguments.arguments(6.135, 23.220975)
        );
    }

    @ParameterizedTest
    @MethodSource("convertGallonToLTestArgs")
    void convertGallonToLTest(double gallon, double expected){
        volumeCut.gallon = gallon;
        double actual = volumeCut.convertGallonToL();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertLToPintTestArgs(){
        return List.of(
                Arguments.arguments(15, 31.7007),
                Arguments.arguments(0.695, 1.4687991)
        );
    }

    @ParameterizedTest
    @MethodSource("convertLToPintTestArgs")
    void convertLToPintTest(double L, double expected){
        volumeCut.L = L;
        double actual = volumeCut.convertLToPint();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertPintToLTestArgs(){
        return List.of(
                Arguments.arguments(6238, 2951.6698369437),
                Arguments.arguments(3.18, 1.5046986344)
        );
    }

    @ParameterizedTest
    @MethodSource("convertPintToLTestArgs")
    void convertPintToLTest(double pint, double expected){
        volumeCut.pint = pint;
        double actual = volumeCut.convertPintToL();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertLToQuartTestArgs(){
        return List.of(
                Arguments.arguments(9, 9.51021),
                Arguments.arguments(31.126, 32.89053294)
        );
    }

    @ParameterizedTest
    @MethodSource("convertLToQuartTestArgs")
    void convertLToQuartTest(double L, double expected){
        volumeCut.L = L;
        double actual = volumeCut.convertLToQuart();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertQuartToLTestArgs(){
        return List.of(
                Arguments.arguments(7, 6.6244593968),
                Arguments.arguments(4.37, 4.1355553663)
        );
    }

    @ParameterizedTest
    @MethodSource("convertQuartToLTestArgs")
    void convertQuartToLTest(double quart, double expected){
        volumeCut.quart = quart;
        double actual = volumeCut.convertQuartToL();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertLToBarrelTestArgs(){
        return List.of(
                Arguments.arguments(1, 0.0062893082),
                Arguments.arguments(1403.652, 8.828)
        );
    }

    @ParameterizedTest
    @MethodSource("convertLToBarrelTestArgs")
    void convertLToBarrelTest(double L, double expected){
        volumeCut.L = L;
        double actual = volumeCut.convertLToBarrel();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertBarrelToLTestArgs(){
        return List.of(
                Arguments.arguments(0.24, 38.16),
                Arguments.arguments(159, 25281)
        );
    }

    @ParameterizedTest
    @MethodSource("convertBarrelToLTestArgs")
    void convertBarrelToLTest(double barrel, double expected){
        volumeCut.barrel = barrel;
        double actual = volumeCut.convertBarrelToL();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertLToCubicFootTestArgs(){
        return List.of(
                Arguments.arguments(18, 0.6356605573),
                Arguments.arguments(6.539, 0.2309213547)
        );
    }

    @ParameterizedTest
    @MethodSource("convertLToCubicFootTestArgs")
    void convertLToCubicFootTest(double L, double expected){
        volumeCut.L = L;
        double actual = volumeCut.convertLToCubicFoot();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertCubicFootToLTestArgs(){
        return List.of(
                Arguments.arguments(2, 56.634),
                Arguments.arguments(15.312, 433.589904)
        );
    }

    @ParameterizedTest
    @MethodSource("convertCubicFootToLTestArgs")
    void convertCubicFootToLTest(double cubicFoot, double expected){
        volumeCut.cubicFoot = cubicFoot;
        double actual = volumeCut.convertCubicFootToL();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertLToCubicInchTestArgs(){
        return List.of(
                Arguments.arguments(3, 183.072),
                Arguments.arguments(84.323, 5145.726752)
        );
    }

    @ParameterizedTest
    @MethodSource("convertLToCubicInchTestArgs")
    void convertLToCubicInchTest(double L, double expected){
        volumeCut.L = L;
        double actual = volumeCut.convertLToCubicInch();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertCubicInchToLTestArgs(){
        return List.of(
                Arguments.arguments(17, 0.2785789198),
                Arguments.arguments(78.0554, 1.2790934714)
        );
    }

    @ParameterizedTest
    @MethodSource("convertCubicInchToLTestArgs")
    void convertCubicInchToLTest(double cubicInch, double expected){
        volumeCut.cubicInch = cubicInch;
        double actual = volumeCut.convertCubicInchToL();
        Assertions.assertEquals(expected, actual);
    }

    //  ---------------------------WEIGHT-----------------------------

    Weight weightCut = new Weight();

    static List<Arguments> convertKgToGramTestArgs(){
        return List.of(
                Arguments.arguments(4, 4000),
                Arguments.arguments(0.65, 650)
        );
    }

    @ParameterizedTest
    @MethodSource("convertKgToGramTestArgs")
    void convertKgToGramTest(double kg, double expected){
        weightCut.kg = kg;
        double actual = weightCut.convertKgToGram();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertGramToKgTestArgs(){
        return List.of(
                Arguments.arguments(5600, 5.6),
                Arguments.arguments(23.6, 0.0236)
        );
    }

    @ParameterizedTest
    @MethodSource("convertGramToKgTestArgs")
    void convertGramToKgTest(double gram, double expected){
        weightCut.gram = gram;
        double actual = weightCut.convertGramToKg();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertKgToCaratTestArgs(){
        return List.of(
                Arguments.arguments(23, 115000),
                Arguments.arguments(0.1254, 627)
        );
    }

    @ParameterizedTest
    @MethodSource("convertKgToCaratTestArgs")
    void convertKgToCaratTest(double kg, double expected){
        weightCut.kg = kg;
        double actual = weightCut.convertKgToCarat();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertCaratToKgTestArgs(){
        return List.of(
                Arguments.arguments(63, 0.0126),
                Arguments.arguments(3264.325, 0.652865)
        );
    }

    @ParameterizedTest
    @MethodSource("convertCaratToKgTestArgs")
    void convertCaratToKgTest(double carat, double expected){
        weightCut.carat = carat;
        double actual = weightCut.convertCaratToKg();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertKgToEngPoundTestArgs(){
        return List.of(
                Arguments.arguments(10, 4.5359290944),
                Arguments.arguments(1.6230, 0.736181292)
        );
    }

    @ParameterizedTest
    @MethodSource("convertKgToEngPoundTestArgs")
    void convertKgToEngPoundTest(double kg, double expected){
        weightCut.kg = kg;
        double actual = weightCut.convertKgToEngPound();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertEngPoundToKgTestArgs(){
        return List.of(
                Arguments.arguments(4, 8.81848),
                Arguments.arguments(0.4536, 1.000015632)
        );
    }

    @ParameterizedTest
    @MethodSource("convertEngPoundToKgTestArgs")
    void convertEngPoundToKgTest(double engPound, double expected){
        weightCut.engPound = engPound;
        double actual = weightCut.convertEngPoundToKg();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertKgToPoundTestArgs(){
        return List.of(
                Arguments.arguments(36, 79.36632),
                Arguments.arguments(1.2346, 2.721823852)
        );
    }

    @ParameterizedTest
    @MethodSource("convertKgToPoundTestArgs")
    void convertKgToPoundTest(double kg, double expected){
        weightCut.kg = kg;
        double actual = weightCut.convertKgToPound();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertPoundToKgTestArgs(){
        return List.of(
                Arguments.arguments(63, 28.5763532944),
                Arguments.arguments(0.463, 0.2100135171)
        );
    }

    @ParameterizedTest
    @MethodSource("convertPoundToKgTestArgs")
    void convertPoundToKgTest(double pound, double expected){
        weightCut.pound = pound;
        double actual = weightCut.convertPoundToKg();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertKgToStoneTestArgs(){
        return List.of(
                Arguments.arguments(124, 19.5275590551),
                Arguments.arguments(7.39995, 1.1653464567)
        );
    }

    @ParameterizedTest
    @MethodSource("convertKgToStoneTestArgs")
    void convertKgToStoneTest(double kg, double expected){
        weightCut.kg = kg;
        double actual = weightCut.convertKgToStone();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertStoneToKgTestArgs(){
        return List.of(
                Arguments.arguments(1, 6.35),
                Arguments.arguments(5.4, 34.29)
        );
    }

    @ParameterizedTest
    @MethodSource("convertStoneToKgTestArgs")
    void convertStoneToKgTest(double stone, double expected){
        weightCut.stone = stone;
        double actual = weightCut.convertStoneToKg();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertKgToRusFuntTestArgs(){
        return List.of(
                Arguments.arguments(52, 126.9788),
                Arguments.arguments(0.3452, 0.84294388)
        );
    }

    @ParameterizedTest
    @MethodSource("convertKgToRusFuntTestArgs")
    void convertKgToRusFuntTest(double kg, double expected){
        weightCut.kg = kg;
        double actual = weightCut.convertKgToRusFunt();
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> convertRusFuntToKgTestArgs(){
        return List.of(
                Arguments.arguments(96, 39.3136492076),
                Arguments.arguments(0.784, 0.3210614685)
        );
    }

    @ParameterizedTest
    @MethodSource("convertRusFuntToKgTestArgs")
    void convertRusFuntToKgTest(double rusFunt, double expected){
        weightCut.rusFunt = rusFunt;
        double actual = weightCut.convertRusFuntToKg();
        Assertions.assertEquals(expected, actual);
    }

}
