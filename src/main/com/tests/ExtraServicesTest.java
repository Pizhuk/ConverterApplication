package main.com.tests;

import main.com.converter.services.ExtraServices;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class ExtraServicesTest {
    ExtraServices extraServicesCut = new ExtraServices();
    static List<Arguments> IsDoubleTestArgs() {
        return List.of(
                Arguments.arguments("0.32", true),
                Arguments.arguments("-0.32", false),
                Arguments.arguments("0,34", false)
        );
    }

    @ParameterizedTest
    @MethodSource("IsDoubleTestArgs")
    void IsDoubleTest(String str, boolean expected){
        boolean actual = extraServicesCut.IsDouble(str);
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> IsDoubleWithMinusTestArgs() {
        return List.of(
                Arguments.arguments("0.32", true),
                Arguments.arguments("-0.32", true),
                Arguments.arguments("0,34", false)
        );
    }

    @ParameterizedTest
    @MethodSource("IsDoubleWithMinusTestArgs")
    void IsDoubleWithMinusTest(String str, boolean expected){
        boolean actual = extraServicesCut.IsDoubleWithMinus(str);
        Assertions.assertEquals(expected, actual);
    }
}
