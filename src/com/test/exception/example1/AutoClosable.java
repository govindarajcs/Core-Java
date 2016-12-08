package com.test.exception.example1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AutoClosable {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		/*
		 * A new feature introduced in java 1.7 version. i.e. declaring the resources in the curly braces 
		 * of try which will automatically closes once the control goes out of try block. In order to 
		 * achieve that the class which is defined in the curly braces of try should implement closable interface. 
		 * In this case Closable interface is implemented in reader abstract class
		 */
	try(BufferedReader reader = new BufferedReader(new FileReader(new File("D:/temp.txt")))){     
			
		}
	/*
	 * Catch multiple exceptions in the same catch block is yet another feature introduced in java 1.7.
	 */
		catch(RuntimeException | IOException e){
			
		} 
		

	}

}
