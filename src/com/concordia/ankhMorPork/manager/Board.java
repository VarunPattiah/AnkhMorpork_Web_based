package com.concordia.ankhMorPork.manager;
/**
 * 
 * @author VarunPattiah
 * Feb 3, 2015
 * 10:38:54 AM
 * 2015
 * @email: varunpattiah@gmail.com
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * Class contains the information about the game including details of each player
 * Complete Information about area,personalityCardDetails,cityAreaCard,randomEventCard,playerCard
 */
public class Board {
	//instance variable
	private List<Area> area;
	private Integer bankMoney;
	private Map<String,String> personalityCardDetails;
	private List<CityAreaCard> cityAreaCard;
	private HashMap<Integer, HashMap<String, String>> randomEventCard;
	private Integer noOfPlayer;
	private List<Player> playerList;
	private List<Integer> existingPlayercards;
	private Integer playerTurn;
	
	/**
	 * This function is used to retreieve player turn
	 * @return: Integer value is returned as player turn
	 */
	public Integer getPlayerTurn() {
		return playerTurn;
	}
	/**
	 * This function sets the player turn
	 */
	
	public void setPlayerTurn(Integer playerTurn) {
		this.playerTurn = playerTurn;
	}
	//setters and getters
	/**
	 * It retrieves the area list
	 * @return: list containing areas is returned
	 * 
	 */
		public List<Area> getArea() {
		return area;
	}
	/**
	 * This function sets the area
	 */
		
	public void setArea(List<Area> area) {
		this.area = area;
	}
	/**
	 * It fetches the bank money
	 * @return: bank money as integer
	 */
	
	public Integer getBankMoney() {
		return bankMoney;
	}
	/**
	 * This function is sets the money amount in bank
	 */
	
	public void setBankMoney(Integer bankMoney) {
		this.bankMoney = bankMoney;
	}
	

	/**
	 * It fetches the details of personality cards
	 * @return: personalityCard details
	 */
	
	public Map<String, String> getPersonalityCardDetails() {
		return personalityCardDetails;
	}
	public void setPersonalityCardDetails(Map<String, String> personalityCardDetails) {
		this.personalityCardDetails = personalityCardDetails;
	}

	/**
	 * It fetches the list of city area cards on the board
	 * @return: city area cards in a list
	 */
	public List<CityAreaCard> getCityAreaCard() {
		return cityAreaCard;
	}

	/**
	 * It fetches the bank money
	 * @return: bank money as integer
	 */
	public void setCityAreaCard(List<CityAreaCard> cityAreaCard) {
		this.cityAreaCard = cityAreaCard;
	}
	public HashMap<Integer, HashMap<String, String>> getRandomEventCard() {
		return randomEventCard;
	}
	public void setRandomEventCard(HashMap<Integer, HashMap<String, String>> randomEventCards) {
		this.randomEventCard = randomEventCards;
	}
	

	/**
	 * This function works to retrieve number of players in game
	 * @return: number of players
	 */
	public Integer getNoOfPlayer() {
		return noOfPlayer;
	}

	/**
	 * Sets the no. of players playing the game
	 */
	public void setNoOfPlayer(Integer noOfPlayer) {
		this.noOfPlayer = noOfPlayer;
	}

	/**
	 * Retrieves the list of players playing the game
	 * @return: player list containing player names is returned
	 */
	public List<Player> getPlayerList() {
		return playerList;
	}

	/**
	 * Sets the player names playing the game in a list
	 */
	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}

	/**
	 * It fetches the player card available on board
	 * @return: bank money as integer
	 */
	
	public List<Integer> getExistingPlayercards() {
		return existingPlayercards;
	}
	public void setExistingPlayercards(List<Integer> existingPlayercards) {
		this.existingPlayercards = existingPlayercards;
	}
	

	
}
