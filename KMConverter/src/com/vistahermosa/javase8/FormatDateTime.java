/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vistahermosa.javase8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author user
 */
public class FormatDateTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate current = LocalDate.now();
        System.out.println(current);
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dtf.format(current));
        DateTimeFormatter dtf_short = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter dtf_long = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println("short:[" + dtf_short.format(current) + "] long:[" + dtf_long.format(current) + "]");
    }
    
}
