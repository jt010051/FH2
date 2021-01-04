package com.computer.microsoft;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Date;
import java.util.Scanner;

public class Inventory {
	 final static String inStock = "C:\\Users\\jonthomas.smith\\Documents\\Inventory.txt";
	    private FileOutputStream fileOutputStream;

public void in1() {
    try {
        File list = new File(inStock);
        FileWriter writeto = new FileWriter(inStock, true);
        String  components = "CPU, Ram, Hard Drive, Fan, Motherboard, Network Card";

        if (!list.exists()) {
            Files.createFile(Paths.get(inStock));
            
            writeto.write(components);
            writeto.close();
        }
        


 Scanner r = new Scanner (list);
 
 
 while (r.hasNextLine()) {
 	String data = r.nextLine();
 	System.out.println(data);
 	
 	
 }



    } catch (IOException e) {
        e.printStackTrace();
    }
    finally {
		  System.out.println("Internal Components \n");
	  }
}


}
