package com.computer.microsoft;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Date;

public class Revenue {
	 final static String revenueText = "C:\\Users\\jonthomas.smith\\Documents\\revenue.txt";

	 public Revenue(String entry) {
		    try {
		        File list = new File(revenueText);

		        String message = String.format("ENTRY Date:[%s] -- %s\n", new Date(), entry);
		        if (!list.exists()) {
		            Files.createFile(Paths.get(revenueText));
		        }
		        Files.write(
		                Paths.get(revenueText),
		                message.getBytes(),
		                StandardOpenOption.APPEND,
		                StandardOpenOption.READ
		        );
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		    finally {
				  System.out.println("End");
			  }
		}

		
		
}
