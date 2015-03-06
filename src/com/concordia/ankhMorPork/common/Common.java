package com.concordia.ankhMorPork.common;

import java.io.File;
import java.util.Scanner;

/**
 * @author elDiablo
 * Feb 2, 2015
 * 2:16:36 PM
 * 2015
 * @email: sumitsarkarbd@gmail.com
 */
public class Common {
	
	

	/** 
	 * This function list all the files and directory list of the certain path. All the files name are saved in a list 
	 *  
	 * @param directoryPath : It's a string path of the directory need to read.
	 */
	public static void listOfTheFiles(String directoryPath){
		
		File folder = new File(directoryPath);
		File[] listOfFiles = folder.listFiles();
		
		if (listOfFiles.length == 0) {
			System.out.println("This directory is empty");
		}
		else{
			for (int i = 0; i < listOfFiles.length; i++) {
				//For files
		      if (listOfFiles[i].isFile()) {
		    	Global.LIST_OF_SAVED_FILES.add(i, listOfFiles[i].getName()
		    			.substring(0, listOfFiles[i].getName().lastIndexOf('.')));
		        System.out.println( i+1+". " + listOfFiles[i].getName());
		      }
		      //For directory
		      else if (listOfFiles[i].isDirectory()) {
		        System.out.println("Directory " + listOfFiles[i].getName());
		      }
		    }
		}
		
	}// End of listOfTheFiles
	
	/**
	 * This function is taking user input hat should be an integer. In-case of invalid input it's asking to re-enter.
	 * @return userInput: It returns the userInput which is an integer. 
	 */
	public static int userInputValidationCheck(){
		Scanner scanner = new Scanner(System.in);
	    int userInput;
	    
	    do {
	        System.out.println("Please enter a positive number!");
	        while (!scanner.hasNextInt()) {
	            System.out.println("That's not a number!");
	            scanner.next(); // this is important!
	        }
	        userInput = scanner.nextInt();
	        	        
	    } while ((userInput <= 0) || (userInput > Global.LIST_OF_SAVED_FILES.size()));
//	    System.out.println("Thank you! Got " + userInput);
	    return userInput;
	    
	} // End of userInputValidationCheck
	
	
	/**
	 * This function is printing all the saved files. 
	 * @param arrayListPosition: It's a list of different position of the board 
	 */
	public static String userChoice(Integer arrayListPosition){
		String saveedFileName = Global.LIST_OF_SAVED_FILES.get(arrayListPosition-1);
		System.out.println(Global.LIST_OF_SAVED_FILES.get(arrayListPosition-1));
		return saveedFileName;
	}
	
	
	
	/**
	 * The  display function is showing the welcome text in the start of the game.
	 * 
	 */

	public static void display() {
		System.out
				.println("==============================================================");
		System.out
				.println("        Welcome to DisckWorld : AnkhMorpork                   ");
		System.out
				.println("=============================================================="
						+ "\n" + "\n");
		
	}
	
	/**
	 * The  displayMenu function is showing the menus.
	 * 
	 */

	public static void displayMenu() {
		System.out.println("\n\t\t\t Press 'N' to Play a New Game\n");
		System.out.println("\t\t\t Press 'R' to Resume existing Game\n");
		System.out.println("\t\t\t Press 'E' to Exit from the game Game");
	}

	
	/**
	 * The  displayThankyouMenu function is showing thankyou message on exiting the game.
	 * 
	 */
	
	public static void displayThankyouMenu() {
		System.out.println("\t\t\tThank You !! We are Exiting from the game.");
		
	}

}
