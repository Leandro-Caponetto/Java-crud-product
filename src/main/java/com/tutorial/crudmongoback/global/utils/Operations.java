package com.tutorial.crudmongoback.global.utils;

public class Operations {

    public static String trimBrakets(String message){
        return message.replaceAll("[\\[\\]]", "");
    }
}
