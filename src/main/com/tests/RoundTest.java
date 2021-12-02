package main.com.tests;

import main.com.converter.categoriesOfConversation.Length;
import main.com.converter.services.ExtraServices;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class RoundTest {
    Length cut = new Length();
    static List<Arguments> RoundTestArgs() {
        return List.of(
                Arguments.arguments(3.456, 2, 3.46),
                Arguments.arguments(-1.432, 1, -1.4)
        );
    }

    @ParameterizedTest
    @MethodSource("RoundTestArgs")
    void RoundTest(double value, int places, double expected){
        double actual = cut.round(value, places);
        Assertions.assertEquals(expected, actual);
    }
}
