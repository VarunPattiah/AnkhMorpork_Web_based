package com.concordia.ankhMorPork.data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.concordia.ankhMorPork.common.Global;
import com.concordia.ankhMorPork.common.Language;
import com.concordia.ankhMorPork.manager.Board;
import com.concordia.ankhMorPork.manager.CityAreaCard;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * @author elDiablo Jan 29, 2015 12:02:00 PM 2015
 * @email: sumitsarkarbd@gmail.com
 */

/*
 * This class have all the methods to generate the JSON file about the current
 * game status
 */
public class GameStateJsonGenerator {
	public static List<CityAreaCard> cityAreaCardList = new ArrayList<CityAreaCard>();

/**
 * This function save the current game's status in json format when it's called.
 * @param board: This parameter accesses the information of the board
 * @return:The function return boolean value to check whether the game has been saved
 */
	public boolean saveGameCurrentStateToJsonFormate(Board board) {
		boolean isSaved = false;
		
		try {

			JsonFactory jfactory = new JsonFactory();

			/*** write to file ***/
			JsonGenerator jGenerator = jfactory
					.createJsonGenerator(new File(
							Global.SAVED_FILE_DIRECTORY_PATH + "/"
									+ Global.saveFileName + ".json"),
							JsonEncoding.UTF8);

			jGenerator.writeStartObject(); // {
			jGenerator.writeFieldName(Language.DISCWORLD);
			jGenerator.writeStartObject();
			jGenerator.writeNumberField(Language.BANK_MONEY, board.getBankMoney());
			// Number of player
			jGenerator.writeStringField(Language.NO_OF_PLAYERS,board.getNoOfPlayer().toString());
			jGenerator.writeStringField(Language.PLAYER_TURN,board.getPlayerTurn().toString());
			jGenerator.writeArrayFieldStart(Language.PLAYERS);
			for (int i = 0; i < board.getNoOfPlayer(); i++) {
				 
				//Array of player information
				jGenerator.writeStartObject(); 
				jGenerator.writeStringField(Language.PLAYER_ID,String.valueOf(i+1));
				jGenerator.writeStringField(Language.PLAYER_NAME, board.getPlayerList().get(i).getName());
				jGenerator.writeStringField(Language.COLOR, board.getPlayerList().get(i).getColor());
				jGenerator.writeNumberField(Language.PERSONALITY_CARD, board.getPlayerList().get(i).getPersonalityCard());
				jGenerator.writeNumberField(Language.NO_OF_MINIONS, Global.MINIONS - board.getPlayerList().get(i).getMinionsOnBoard());
				jGenerator.writeNumberField(Language.NO_OF_BUILDING, Global.BUILDINGS - board.getPlayerList().get(i).getBuildingOnBoard());
				jGenerator.writeNumberField(Language.PLAYER_MONEY, board.getPlayerList().get(i).getPlayerMoney());
				
				//Write array for city area cards
				jGenerator.writeFieldName(Language.CITY_AREA_CARD);
				
				
				if (board.getPlayerList().get(i).getCityAreaCard().size() == 0) {
					jGenerator.writeString("NIL");
				} else {
					jGenerator.writeStartArray();
					for (int j = 0; i < board.getPlayerList().get(i).getCityAreaCard().size(); j++) {
						jGenerator.writeNumber(board.getPlayerList().get(i).getCityAreaCard().get(j));
					}
					jGenerator.writeEndArray();
				}
				
				
				//Write array for city area cards
				
				jGenerator.writeStringField(Language.GREEN_CARDS, board.getPlayerList().get(i).getGreenPlayerCards().toString());
				jGenerator.writeStringField(Language.BROWN_CARDS, board.getPlayerList().get(i).getBrownPlayerCards().toString());
				
				
				
				jGenerator.writeEndObject();
			}
			
			jGenerator.writeEndArray();
			jGenerator.writeArrayFieldStart(Language.AREA_DETAILS);
			for (int i = 0; i < 12; i++) {
				 
				//Array of player information
				jGenerator.writeStartObject(); 
				jGenerator.writeStringField(Language.AREA_NO,String.valueOf(i+1));
				jGenerator.writeStringField(Language.AREA, board.getCityAreaCard().get(i).getName());
				jGenerator.writeStringField(Language.MINIONS, board.getArea().get(i).getColorOfMinion().toString());
				jGenerator.writeBooleanField(Language.IS_TROUBLEMAKER_AVAILABLE, board.getArea().get(i).getTroubleMaker());
				jGenerator.writeBooleanField(Language.IS_BUILDING_AVAILABLE,board.getArea().get(i).getBuilding());
				jGenerator.writeNumberField(Language.NO_OF_DEMONS,board.getArea().get(i).getNoOfDemon());
				jGenerator.writeNumberField(Language.NO_OF_TROLL,board.getArea().get(i).getNoOfTroll());
				jGenerator.writeEndObject();
			}
			jGenerator.writeEndArray();
			jGenerator.writeEndObject(); // }

			jGenerator.close();

		} catch (JsonGenerationException e) {

			e.printStackTrace();

		} catch (JsonProcessingException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
		//If file saved
		isSaved = true;

		return isSaved;
	}

}
