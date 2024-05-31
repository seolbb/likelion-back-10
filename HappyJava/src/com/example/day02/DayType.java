package com.example.day02;

public class DayType {
    public final static int SUNDAY = 0;
    public final static int MONDAY = 1;
    public final static int TUESDAY = 2;
    public final static int WEDNESDAY = 3;
    public final static int THURSDAY = 4;
    public final static int FRIDAY = 5;
    public final static int SATURDA = 6;
    int day;
    public static void main(String[] args) {
       DayType d1 = new DayType();
       d1.day = DayType.SUNDAY;

       d1.day = 10;

        System.out.println();
    }
}
