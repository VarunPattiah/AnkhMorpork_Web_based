package com.concordia.ankhMorPork.launcher;

import java.util.ArrayList;
import java.util.List;

import com.concordia.ankhMorPork.common.Global;
import com.concordia.ankhMorPork.manager.Board;
import com.concordia.ankhMorPork.manager.BoardManager;
/**
 * 
 * @author VarunPattiah
 * Mar 7, 2015
 * 9:56:03 AM
 * 2015
 * @email: varunpattiah@gmail.com
 */

/**
 * This Class Control the flow of the game from the UI . Its a controller which will call the service layer based on UI action Event.
 */

public class AnkhMorPorkController {
	
	private BoardManager boardManager;
	private Board board;
	private List<String> playerName = new ArrayList<String>();
	private List<String> colorList = new ArrayList<String>();
	public AnkhMorPorkController() {
		this.boardManager = new BoardManager();
	}

	public BoardManager initializeNewGame(int numberOfPlayers,String playerNamelist)
	{
		Global.numberOfPlayers=numberOfPlayers;
		List<Integer> existingColor = new ArrayList<Integer>();
		String[] playerlist=null;
		playerlist=playerNamelist.split(",");
		for (int i = 0; i < Global.numberOfPlayers; i++) {
			
			System.out.println(playerlist[i]);
			playerName.add(playerlist[i]);
			
			int randomColor = this.boardManager.generateRandom(1, 4, existingColor );
			System.out.println("randomColor"+randomColor);
			existingColor.add(randomColor);
			System.out.println("Your Color is: " + Global.Color.get(randomColor-1));
			colorList.add(Global.Color.get(randomColor-1));
		}
		board = boardManager.initializeBoardforNewPlayer(
				Global.numberOfPlayers, playerName, colorList);
		boardManager.setBoard(board);
		return boardManager;
		
	}
	public static void main(String args[])
	{
		AnkhMorPorkController a=new AnkhMorPorkController();
		a.initializeNewGame(2,"Player1,Player2");
		
	}
	
}
