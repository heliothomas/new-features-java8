/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vistahermosa.javase8;

import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class JoinerMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String partners = String.join(", ", "Helio", "Elizabeth", "Magally", "Raquelita");
        System.out.println(partners);
        
        String[] states = {"California","Oregon","Washington"};
        String statesList = String.join(", ", states);
        System.out.println(statesList);
        
        //Working with Collections
        Set<String> cities = new TreeSet<>();
        cities.add("Esteli");
        cities.add("Managua");
        cities.add("Leon");
        cities.add("Granada");
        
        StringJoiner sj = new StringJoiner(" and ");
        
        //Passing each element of Set Collection to StringJoiner
        cities.forEach( s -> sj.add(s) );
        System.out.println(sj);
    }
    
}
