package com.concordia.ankhMorPork.manager;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BoardManagerTest {

	List<Integer> existingCards;
	BoardManager boardManager;
	@Before
	public void setUp() throws Exception {
		existingCards=new ArrayList<Integer>();
		boardManager = new BoardManager();
		Collections.addAll(existingCards,1,23,45,43,23);
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testGetMoneyDistributedCount() {
		//fail("Not yet implemented");
	}

	@Test
	public void testSetMoneyDistributedCount() {
		//fail("Not yet implemented");
	}

	@Test
	public void testDisplayCurrentStatus() {
		//fail("Not yet implemented");
	}

	@Test
	public void testInitializeBoardforNewPlayer() {
		
	}

	@Test
	public void testGenerateRandom() {
		Integer randomnumber  = boardManager.generateRandom(1, 48, existingCards);
		boolean expected=existingCards.contains(randomnumber);
		assertFalse(expected);
	}

	@Test
	public void testGetBoard() {
		//fail("Not yet implemented");
	}

	@Test
	public void testSetBoard() {
		//fail("Not yet implemented");
	}

	@Test
	public void testSaveGameStatus() {
		//fail("Not yet implemented");
	}

}
