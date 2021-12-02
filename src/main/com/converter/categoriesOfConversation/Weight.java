package main.com.converter.categoriesOfConversation;

public class Weight {
    public double kg;
    public double gram;
    public double carat;
    public double engPound;
    public double pound;
    public double stone;
    public double rusFunt;

    public double round(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    public double convertKgToGram() {
        double gram = kg*1000;
        return round(gram, 10);
    }

    public double convertGramToKg() {
        double kg = gram/1000;
        return round(kg, 10);
    }

//  ________________________________________

    public double convertKgToCarat() {
        double carat = kg*5000;
        return round(carat, 10);
    }

    public double convertCaratToKg() {
        double kg = carat/5000;
        return round(kg, 10);
    }

//  _________________________________________

    public double convertKgToEngPound() {
        double engPound = kg/2.20462;
        return round(engPound, 10);
    }

    public double convertEngPoundToKg() {
        double kg = engPound*2.20462;
        return round(kg, 10);
    }

//  ___________________________________________

    public double convertKgToPound() {
        double pound = kg*2.20462;
        return round(pound, 10);
    }

    public double convertPoundToKg() {
        double kg = pound/2.20462;
        return round(kg, 10);
    }

//  ____________________________________________

    public double convertKgToStone() {
        double stone = kg/6.35;
        return round(stone, 10);
    }

    public double convertStoneToKg() {
        double kg = stone*6.35;
        return round(kg, 10);
    }

//  _____________________________________________

    public double convertKgToRusFunt() {
        double rusFunt= kg*2.4419;
        return round(rusFunt, 10);
    }

    public double convertRusFuntToKg() {
        double kg= rusFunt/2.4419;
        return round(kg, 10);
    }
}
