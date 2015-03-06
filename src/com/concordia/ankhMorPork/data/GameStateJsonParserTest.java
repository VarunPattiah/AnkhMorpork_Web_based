package com.concordia.ankhMorPork.data;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class GameStateJsonParserTest {
	GameStateJsonParser gameStateJsonParser;
	String input=null;
	String string=null;

	@Before
	public void setUp() throws Exception {
		gameStateJsonParser=new GameStateJsonParser();
		input="[19, 18, 8, 15, 41]";
		string="[Red, Yellow]";
		
	}

	@Test
	public void testGet_integer_list() {
		List<Integer> expected =new ArrayList<Integer>();
		Collections.addAll(expected, 19,18,8,15,41);
		assertEquals(expected, gameStateJsonParser.get_integer_list(input));
	}

	@Test
	public void testParseJson() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGet_String_list() {
		List<String> expected =new ArrayList<String>();
		expected.add("Red");
		expected.add("Yellow");
		assertEquals(expected, gameStateJsonParser.get_String_list(string));
	}

}
