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
	
	public BoardManager initializeResumeGame(String filename)
	{
		return boardManager;
	}
	public String getAreaDetails(int areaNumber)
	{
		String html="";
		int i=this.boardManager.getBoard().getArea().get(areaNumber).getColorOfMinion().size();
		System.out.println("i : "+i+"  Area Name : "+this.boardManager.getBoard().getArea().get(areaNumber).getIdentifier());
		while(i>0){
				html+="<div id=\"minion-"+(i)+"\" class=\"drag minion minion-"+this.boardManager.getBoard().getArea().get(areaNumber).getColorOfMinion().get(i-1).toLowerCase()+"\" draggable=\"true\"></div>";
				
				i--;
		}
		if(this.boardManager.getBoard().getArea().get(areaNumber).getTroubleMaker()){
			html+="<div id=\"trouble-1\" class=\"drag trouble\" draggable=\"true\"></div>";
		}
		if(this.boardManager.getBoard().getArea().get(areaNumber).getBuilding()){
			html+="";
		}
		i=this.boardManager.getBoard().getArea().get(areaNumber).getNoOfDemon();
		while(i>0){
			html+="<div id=\"demon-"+i+"\" class=\"drag demon\" draggable=\"true\"></div>";
			i--;
		}
		i=this.boardManager.getBoard().getArea().get(areaNumber).getNoOfTroll();
		while(i>0){
			html+="<div id=\"troll-"+i+"\" class=\"drag troll\" draggable=\"true\"></div>";
			i--;
		}
		System.out.println("html : "+html);
		return html;
	}
	public static void main(String args[])
	{
		AnkhMorPorkController a=new AnkhMorPorkController();
		a.initializeNewGame(2,"Player1,Player2");
		
	}
	
}
