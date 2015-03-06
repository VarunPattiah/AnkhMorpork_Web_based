package com.concordia.ankhMorPork.common;

import java.util.ArrayList;
import java.util.Arrays;

import com.fasterxml.jackson.core.sym.Name;



/**
 * @author elDiablo
 *
 */

/*
 * In this file we will write the global components
 * what will need all over the project 
 * */
public class Global {
	
	public enum Color {
		RED(0), GREEN(1), BLUE(2), YELLLOW(3);
		
		private int text;
		private Color(int text)
		{
			this.text=text;
		}
		public static String get(int index)
		{
			return String.valueOf(values()[index]);
		}
		
	}
	final public static Integer BUILDINGS = 6;
	final public static Integer MINIONS = 12;
	final public static double INITIAL_MONEY = 10.00;
	final public static ArrayList<String> LIST_OF_SAVED_FILES = new ArrayList<String>();
	final public static String SAVED_FILE_DIRECTORY_PATH = "resources/savedGame";
	final public static Integer BANK_MONEY = 120;
	final public static Integer NO_OF_AREA=12;
	public static String saveFileName;
	public static Integer numberOfPlayers;
	//public static Color colorList = new Color();
	//public static ArrayList<String> colorList = new ArrayList<String>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

}
