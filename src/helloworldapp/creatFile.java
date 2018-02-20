/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author pgrenning
 */


import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import java.util.Arrays;
import java.util.List;



public class creatFile {
    public static void main(String[] args) throws IOException {
        File file = new File("/tmp/javatestFile1.txt");
        System.out.println("File is created!");
        
        //Write Content
        FileWriter writer = new FileWriter(file);
        writer.write("Test data");
        writer.close();
   } 
}
