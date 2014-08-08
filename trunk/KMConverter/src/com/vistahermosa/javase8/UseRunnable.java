/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vistahermosa.javase8;

/**
 *
 * @author user
 */
public class UseRunnable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running Thread 1.");
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running Thread 2.");
            }
        };
        */
        
        //Using Lambda Expression is shorter than old form.
        Runnable r1 = () -> System.out.println("Running Thread 1.");
        Runnable r2 = () -> System.out.println("Running Thread 2.");
        
        new Thread(r1).start();
        new Thread(r2).start();
    }
    
}
