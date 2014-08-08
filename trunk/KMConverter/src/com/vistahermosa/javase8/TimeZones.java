/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vistahermosa.javase8;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Set;
import java.util.function.Predicate;

/**
 *
 * @author user
 */
public class TimeZones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

        LocalDateTime local = LocalDateTime.now();
        System.out.println("Local: " + dtf.format(local));
        
        //ZonedDateTime
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("GMT+0"));
        System.out.println("GMT: " + dtf.format(zdt));
        
        zdt = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("New_York: " + dtf.format(zdt));
        
        zdt = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Tokyo: " + dtf.format(zdt));
        
        zdt = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Paris: " + dtf.format(zdt));
        
        Set<String> zones = ZoneId.getAvailableZoneIds();
        Predicate<String> condition = str -> str.contains("agua");
        
        zones.forEach( 
            z -> {
                if (condition.test(z)) {
                    System.out.println(z);
                }
            }
        );
        
    }
    
}
