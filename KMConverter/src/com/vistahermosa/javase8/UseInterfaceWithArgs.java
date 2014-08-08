/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vistahermosa.javase8;

import com.vistahermosa.javase8.interfaces.InterfaceWithArgs;

/**
 *
 * @author user
 */
public class UseInterfaceWithArgs {
    public static void main(String[] args) {
        InterfaceWithArgs obj = (v1, v2) ->
        {
            int answer = v1 * v2;
            System.out.println("The result is: " + answer);
        };
        obj.calculte(10, 5);
    }
}
