package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static final double EARTH_SQUARE = 6371.2;
    public static final double PI = 3.14;


    public static double volumeBallDouble(double radius) {
        final double VOLUME_BALL = 4 / 3 * PI * (EARTH_SQUARE * EARTH_SQUARE * EARTH_SQUARE);
        return VOLUME_BALL;
    }
    public static float volumeBallFloat(float radius){
        final double VOLUME_BALL = 4 / 3 * PI * (EARTH_SQUARE * EARTH_SQUARE * EARTH_SQUARE);
        return (float) VOLUME_BALL;
    }
    public static double calculateAccuracy(double radius){
        return volumeBallDouble(0) - volumeBallFloat(0f);
    }



    public static void main(String[] args) {
        System.out.println(volumeBallDouble(EARTH_SQUARE));
        System.out.println(volumeBallFloat((float) EARTH_SQUARE));
        System.out.println(calculateAccuracy(EARTH_SQUARE));
    }

  


}
