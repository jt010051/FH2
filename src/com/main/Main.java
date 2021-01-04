package com.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;
import com.computer.microsoft.*;
public class Main {

	public static void main(String[] args)  {
		String url = "C:\\Users\\jonthomas.smith\\Documents\\Inventory V2.txt";
        FileWriter writeto;
		try {
			writeto = new FileWriter(url, true);
			File list = new File(url);

	        FileOutputStream out = new FileOutputStream(url);
	        String  programs = "MS Office, Internet Explorer, MS Paint, Eclipse, Calculator, Minesweeper ";
	        
	        writeto.write(programs);
	String app = "MS Office, Edge, MS Paint, Eclipse, Calculator";
	byte[]strToBytes = app.getBytes();
	out.write(app.getBytes());

			Inventory in = new Inventory();	
		in.in1();

			 Scanner read = new Scanner (list);
			 
			 
			 while (read.hasNextLine()) {
			 	String data = read.nextLine();
			 	System.out.println(data);
			 	
			 	
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        finally {
        	System.out.println("Programs on Computer");
        }
		
	}

}
