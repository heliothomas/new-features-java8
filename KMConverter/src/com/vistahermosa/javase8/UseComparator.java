/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vistahermosa.javase8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author user
 */
public class UseComparator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("AAA");
        strings.add("bbb");
        strings.add("CCC");
        strings.add("ddd");
        strings.add("EEE");
        
        //Simple case-sensitive sort operation
        Collections.sort(strings);
        System.out.println("Simple sort");
        for (String str : strings) {
            System.out.println(str);
        }
        
        //Case-insensitive sort with an anonymous class
        //Old way to compare string with ignore case
        /*
        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str1.compareToIgnoreCase(str2);
            }
        });
        */
        
        //Using lambda expression
        Comparator<String> comp = (str1, str2) -> {
            return str1.compareToIgnoreCase(str2);
        };
        Collections.sort(strings, comp);

        System.out.println("Sort with Comparator.");
        for (String str : strings) {
            System.out.println(str);
        }
    }
    
}
