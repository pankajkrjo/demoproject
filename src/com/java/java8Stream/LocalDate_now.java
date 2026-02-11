package com.java.java8Stream;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDate_now {

    public static void main(String[] args) {

        LocalDate date=java.time.LocalDate.now();
        LocalTime time=java.time.LocalTime.now();
        LocalDateTime dateTime=java.time.LocalDateTime.now();
        System.out.println("Current Local Date: " + java.time.LocalDate.now());

        System.out.println("Current Local Time: " + time);
        System.out.println("Current Local Date Time: " + dateTime);
    }
}
