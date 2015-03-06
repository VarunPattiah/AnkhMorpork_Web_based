package com.concordia.ankhMorPork.manager;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private int playerId;
	private String name;
	private String color;
	private Integer minionsOnBoard;
	private Integer buildingOnBoard;
	private Integer playerMoney;
	private Integer personalityCard;
	private String personalityCardString;
	
	public String getPersonalityCardString() {
		return personalityCardString;
	}

	public void setPersonalityCardString(String personalityCardString) {
		this.personalityCardString = personalityCardString;
	}

	private List<Integer> greenPlayerCards;
	private List<Integer> brownPlayerCards;
	private List<Integer> cityAreaCard;

	/**
	 * Parameterized constructor to initialize Player details on initialization.
	 * @param playerID : Assigning player id to class member.
	 * @param playerName	: Setting up the player name.
	 * @param color : Giving a color to a player's object.
	 
	 */
	
	
	public Player(int playerID, String playerName, String color) {
		this.playerId = playerID;
		this.name = playerName;
		this.color = color;
		this.greenPlayerCards = new ArrayList<Integer>();

	}
	/**
	 * It retrieves the player identity
	 * @return returns player identity
	 */

	public int getPlayerId() {
		return playerId;
	}
/**
 * Sets the player ID 
 */
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	/**
	 * This function retrieve the name of the player
	 * @return Name of the players is returned as string
	 */
	public String getName() {
		return name;
	}
	/**
	 * It sets the name of the players in form of string
	 */

	public void setName(String name) {
		this.name = name;
	}
    /**
     * getColor function retrieves the color of the player
     * @return color is returned as the string value 
     */
	public String getColor() {
		return color;
	}
	
	/**
	 * The functions sets the color of the players 
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * It pulls the numbers of minions on board belonging to a player
	 * @return number of minions on board as integer
	 */
	public Integer getMinionsOnBoard() {
		return minionsOnBoard;
	}
   /**
    * sets the number of minions of a player on the board
    */
	public void setMinionsOnBoard(Integer minionsOnBoard2) {
		this.minionsOnBoard = minionsOnBoard2;
	}
    /**
     *  It retrieves the different buildings present on the board for a please
     * @return number of buildings for a player as an integer number
     */
	public Integer getBuildingOnBoard() {
		return buildingOnBoard;
	}
	/**
	 * This function sets the building on an area of a board
	 */
	public void setBuildingOnBoard(Integer buildingOnBoard) {
		this.buildingOnBoard = buildingOnBoard;
	}
	/**
	 * This function simply retrieves the money a player currently holds
	 * @return player money as an integer value
	 */

	public Integer getPlayerMoney() {
		return playerMoney;
	}
	/**
	 * This function sets the money a player currently holds
	 */

	public void setPlayerMoney(Integer playerMoney) {
		this.playerMoney = playerMoney;
	}
	/**
	 * It retrieves the personality card a player holds
	 * @return returns the personality card of a player 
	 */

	public Integer getPersonalityCard() {
		return personalityCard;
	}
	
	/**
	 * 
	 * sets the personality card  for the player
	 */
	public void setPersonalityCard(Integer personalityCard) {
		this.personalityCard = personalityCard;
	}
	
	
	/**
	 *  this function retrieves the green cards a player holds
	 * @return green card returns as integer values
	 */
	public List<Integer> getGreenPlayerCards() {
		return greenPlayerCards;
	}
	
	
	/**
	 * This function is setting the green card for a player
	 * @param playerCards : List of the green cards is passed to assigned to a player.
	 */

	public void setGreenPlayerCards(List<Integer> playerCards) {
		this.greenPlayerCards = playerCards;
	}

	/**
	 * This function is to get the list of brown cards a player can have.
	 * @return It's returning list of the brown cards a player have.
	 */
	public List<Integer> getBrownPlayerCards() {
		return brownPlayerCards;
	}

	/**
	 * This function is setting the brown cards for a player
	 * @param playerCards : List of the brown cards is passed to assigned to a player.
	 */
	
	public void setBrownPlayerCards(List<Integer> playerCards) {
		this.brownPlayerCards = playerCards;
	}

	/**
	 * This function is to get a city area card with respect to a player.
	 * @return it's return the List of the city area cards a player have.
	 */
	public List<Integer> getCityAreaCard() {
		return cityAreaCard;
	}

	/**
	 * This function is used to set the City area card for a player.
	 * @param cityAreaCard : city area cards list is sent to set for a player.
	 */
	public void setCityAreaCard(List<Integer> cityAreaCard) {
		this.cityAreaCard = cityAreaCard;
	}

}
