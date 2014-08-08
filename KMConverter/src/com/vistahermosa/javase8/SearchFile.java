/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vistahermosa.javase8;


import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author user
 */
public class SearchFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Path path = FileSystems.getDefault().getPath("files", "hamlet.txt");
        String term = "To be, or not to be";
        
        try (Stream<String> lines = Files.lines(path)) {
            Optional<String> line = lines.filter(l -> l.contains(term)).findFirst();
            if (line.isPresent()) {
                System.out.println("Found: " + line.get());
            } else {
                System.out.println("Not Found");
            }
        } catch (Exception e) {
            System.out.println("There was an error: " + e.getMessage());
        }
    }
    
}
