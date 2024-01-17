package ru.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 100;
    }

    public static float rubleToDollar(float value) {
        return value / 90;
    }

    public static float rubleToJpy (float value) {
        return value / 78;
    }

    public static float rubleToCny (float value) {
        return value / 67;
    }

    public static void main(String[] args) {
        float in = 450;
        float expected = 5;
        float out = Converter.rubleToDollar(in);
        boolean passed = expected == out;
        System.out.println("450 rubles are 5 Test result : " + passed);

    }
}


