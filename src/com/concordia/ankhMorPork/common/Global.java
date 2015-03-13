package com.concordia.ankhMorPork.common;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
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
public class  Global {
	
	final public static Integer BUILDINGS = 6;
	final public static Integer MINIONS = 12;
	final public static double INITIAL_MONEY = 10.00;
	final public static ArrayList<String> LIST_OF_SAVED_FILES = new ArrayList<String>();
	final public static String SAVED_FILE_DIRECTORY_PATH = "resources/savedGame";
	final public static Integer BANK_MONEY = 120;
	final public static Integer NO_OF_AREA=12;
	public static String saveFileName;
	public static String FILE_PATH;
	public static Integer numberOfPlayers;
	
	static {
		
		String path = new Global().getClass().getClassLoader().getResource("").getPath();
		String fullPath=null;
		try {
			fullPath = URLDecoder.decode(path, "UTF-8");
			System.out.println("fullPath"+fullPath);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String tempPath[]= fullPath.split("/.metadata/.plugins/");
		String pathArr= (String) tempPath[0].substring(1);
		FILE_PATH=pathArr+"/AnkhMorpork_Web_based";
		System.out.println("FILE_PATH"+FILE_PATH);
	}
	
	public enum Color {
		RED(1), GREEN(2), BLUE(3), YELLOW(4);
		
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
	
}
