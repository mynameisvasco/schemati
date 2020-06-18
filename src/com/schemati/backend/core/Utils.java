package com.schemati.backend.core;

public class Utils {
    public static Integer randInt(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }
    public static String intToString(Integer i) { return i.toString();}
}
