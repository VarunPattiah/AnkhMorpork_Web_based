package com.concordia.ankhMorPork.manager;
/**
 *This class contains detailed information about CityAreaCard
 */

public class CityAreaCard {

	private Integer identifier;
	private String name;
	private String description;
	private Integer cost;
	//Setters and getters method
	
	/**
	 * This function is used to get the identifier
	 * @return It is returning identifier of the city area card.
	 */
	public Integer getIdentifier() {
		return identifier;
	}
	
	/**
	 * This function is used to set the identifier of the city area card.
	 * @param identifier The identifier is sent to set the value.
	 */
	public void setIdentifier(Integer identifier) {
		this.identifier = identifier;
	}
	
	/**
	 * This function is to get the name of the city area card.
	 * @return It's returning the string value (Name of the city area card).
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * This function is used to set the name of the city area card.
	 * @param name: The name of the city area card is passed 
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * This function is to get the description of the card
	 * @return It's returning the card description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * This function is used to set the description of the card
	 * @param description : Description is passed to set it for a card.
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * It's used to get the cost of the card.
	 * @return It's returning an integer value of the card cost.
	 */
	public Integer getCost() {
		return cost;
	}
	
	/**
	 * It's used to set the cost of the city area card.
	 * @param cost : Card's cost is passed to set the cost of the card.
	 */
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	
}
