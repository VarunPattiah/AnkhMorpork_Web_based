package com.concordia.ankhMorPork.launcher;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AnkhMorPorkLauncherTest {
	
	AnkhMorPorkLauncher ankhMorPorkLauncher;

	@Before
	public void setUp() throws Exception {
		ankhMorPorkLauncher=new AnkhMorPorkLauncher();
	}

	@Test
	public void testNewGame() {
		ankhMorPorkLauncher.newGame();
		//assertNotNull(ankhMorPorkLauncher.newGame());
	}

	@Test
	public void testSaveGame() {
		fail("Not yet implemented");
	}

	@Test
	public void testLoadGame() {
		fail("Not yet implemented");
	}

}
