package com.concordia.ankhMorPork.manager;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CityAreaCardTest {


	CityAreaCard cityareacard= new CityAreaCard();
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testGetIdentifier() {
		Integer Identifier=2;
		cityareacard.setIdentifier(Identifier);
		Integer expected=2;
		assertEquals(expected, cityareacard.getIdentifier());
		
	}

	@Test
	public void testGetName() {
		String city="Dolly Sisters";
		cityareacard.setName(city);
		String expected="Dolly Sisters";
		assertEquals(expected, cityareacard.getName());
	}

	@Test
	public void testGetDescription() {
	String description="Dolly sister values 12$";
	cityareacard.setDescription(description);
	String expected= "Dolly sister values 12$";
	assertEquals(expected, cityareacard.getDescription());
	
	}


	@Test
	public void testGetCost() {
    Integer cost= 7;
    cityareacard.setCost(cost);
    Integer expected= 7;
    assertEquals(expected, cityareacard.getCost());
	}


	}
