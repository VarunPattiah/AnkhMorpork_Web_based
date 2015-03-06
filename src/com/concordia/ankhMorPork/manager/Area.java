package com.concordia.ankhMorPork.manager;

import java.util.ArrayList;
import java.util.List;

/**
 * Class contains the information about an Area on the board.
 * colorOfMinion,troubleMaker,building,noOfDemon and noOfTroll
 */
public class Area {
	
	Integer identifier;
	List<String> colorOfMinion;
	Boolean troubleMaker;
	Boolean building;
	Integer noOfDemon;
	Integer noOfTroll;
	
	/**
	 * Parameterized constructor to initialize area details on instantiation.
	 * @param troubleMaker : Boolean value if troubleMaker exists on an area.
	 * @param building	: Boolean value if troubleMaker exists on an area.
	 * @param noOfDemon : Number of demons found for that area.
	 * @param noOfTroll : Number of trolls found in that area.
	 */
	public Area(Boolean troubleMaker, Boolean building, Integer noOfDemon, Integer noOfTroll)
	{
		this.troubleMaker=troubleMaker;
		this.building=building;
		this.noOfDemon=noOfDemon;
		this.noOfTroll=noOfTroll;
		this.colorOfMinion=new ArrayList<String>();
	}
	//setters and getters
	
	
	/**
	 * This functions is used to get the identifier of the area / area id.
	 * @return It's returning the identifier
	 */
	public Integer getIdentifier() {
		return identifier;
	}
	
	
	/**
	 * This function is to set the area id we are passing at the time of area initialization
	 * @param identifier : Area id is passed
	 */
	public void setIdentifier(Integer identifier) {
		this.identifier = identifier;
	}
	
	
	/**
	 * This function is used to get the list of the colors of minions.
	 * @return It returns the list of colors of minions
	 */
	public List<String> getColorOfMinion() {
		return colorOfMinion;
	}
	
	/**
	 * The function is used to set the color of minions 
	 * @param colorOfMinion: A list of colors is passed to assigned to minions
	 */
	public void setColorOfMinion(List<String> colorOfMinion) {
		this.colorOfMinion = colorOfMinion;
	}
	
	/**
	 * This function is called to check an area if trouble maker exists on a particular area 
	 * @return Looking if a trouble make exist in an area
	 */
	public Boolean getTroubleMaker() {
		return troubleMaker;
	}
	
	/**
	 * This function is used to set the trouble maker on an Area
	 * @param troubleMaker: A boolean value is sent to set the area with trouble maker.
	 */
	public void setTroubleMaker(Boolean troubleMaker) {
		this.troubleMaker = troubleMaker;
	}
	
	/**
	 * It's making sure if an area have building or not 
	 * @return A boolean value is returned to confirm if a building exists on an area or not.
	 */
	public Boolean getBuilding() {
		return building;
	}
	
	
	/**
	 * This function is used to set the building on an Area
	 * @param building: A boolean value is sent to set the area with building.
	 */
	
	public void setBuilding(Boolean building) {
		this.building = building;
	}
	
	/**
	 * This function is used to get number of demons on an area.
	 * @return It returns the number of demon on an Area
	 */
	public Integer getNoOfDemon() {
		return noOfDemon;
	}
	
	/**
	 * This function is used to set the number of demon on an area
	 * @param noOfDemon Number value is passed to set the demon on an area
	 */
	public void setNoOfDemon(Integer noOfDemon) {
		this.noOfDemon = noOfDemon;
	}
	
	/**
	 * This function is used to get number of trolls on an area.
	 * @return It returns the number of trolls on an Area
	 */
	public Integer getNoOfTroll() {
		return noOfTroll;
	}
	
	/**
	 * This function is used to set the number of trolls on an area
	 * @param noOfTroll Number value is passed to set the troll on an area
	 */
	public void setNoOfTroll(Integer noOfTroll) {
		this.noOfTroll = noOfTroll;
	}
	
	

}
