<%--
 * @author Varun Pattiah
 * Feb 25, 2015
 * 2:16:36 PM
 * 2015
 * @email: varunpattiah@gmail.com
 --%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.concordia.ankhMorPork.manager.BoardManager" %>
<%@ page import="com.concordia.ankhMorPork.common.Global" %>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="../css/style.css" rel="stylesheet" type="text/css">  
<script type="text/javascript" src="../js/jquery-1.9.1.min.js"></script>

<!-- jQuery Popup Overlay -->
<script type="text/javascript" src="../js/jquery.popupoverlay.js"></script>


<script type="text/javascript" src="../js/support.js"></script>
<title>Ankh Morpork</title>
</head>
<body>
	<body>
    <jsp:useBean id="ankhMorPorkController" class="com.concordia.ankhMorPork.launcher.AnkhMorPorkController" /> 
     <div id="board">
	<% 
		String gameStatus=request.getParameter("gameStatus");
		BoardManager boardManager=null;
		Integer noOfPlayer=0;
		String playerNamelist="";
		String[] playerlist=new String[4];
		if("new".equals(gameStatus))
		{
		   noOfPlayer=Integer.parseInt(request.getParameter("noOfPlayer"));
		   playerNamelist=request.getParameter("Playername");	
		   playerlist=playerNamelist.split(",");
		   boardManager=ankhMorPorkController.initializeNewGame(noOfPlayer,playerNamelist);
		}else if("resume".equals(gameStatus)){
			boardManager=ankhMorPorkController.initializeResumeGame(request.getParameter("fileName"));
			noOfPlayer=boardManager.getBoard().getNoOfPlayer();
			for(int j=0;j<noOfPlayer;j++){
			playerlist[j]=boardManager.getBoard().getPlayerList().get(j).getName();
			}
		}
	%> 
	<b>Player turn :</b> = <%=boardManager.getBoard().getPlayerTurn() %>
    
    <div id="players">
    
    <div class="common">
     <div class="title"> Game Assets</div>
     
      <div id="dollor-1" class="drag dollor" draggable="true"></div> 
      <div id="trouble-1" class="drag trouble" draggable="true"></div> 
      
      <div id="troll-1" class="drag troll" draggable="true"></div> 
      <div id="demon-1" class="drag demon" draggable="true"></div>
      
       <% for(int j = 0; j < boardManager.getBoard().getCityAreaCard().size(); j++) { System.out.println("CityAreaCard : "+boardManager.getBoard().getCityAreaCard().get(j).getIdentifier());%>	
       <div id="city_area_card_<%=boardManager.getBoard().getCityAreaCard().get(j).getIdentifier() %>" class="city_area_card fadeandscale_open" alt="City_area_cards/<%=boardManager.getBoard().getCityAreaCard().get(j).getIdentifier() %>.png"></div>
        <% } %>
       			
       <div id="random_event_card_0" class="random_event_card fadeandscale_open" alt="Random_event_cards/r<%=ankhMorPorkController.generateRandomEventCards()%>.png"></div>
     	<button id="transaction" onclick="transactionmenu();">Transactions</button>
     	
            
     </div>
     <div class="clear"></div>
     
     
	 <% for(int i = 0; i < noOfPlayer; i++) { %>
	   
       
        <div id="player<%=i %>" class="player">
        	<div class="title"> <%=playerlist[i] %></div>
        	<% for(int j = 0; j < (Global.MINIONS-boardManager.getBoard().getPlayerList().get(i).getMinionsOnBoard()); j++) { %>
            <div id="<%=i %>-minion-<%=j %>" class="drag minion minion-<%=boardManager.getBoard().getPlayerList().get(i).getColor().toLowerCase()%>" draggable="true"></div>
            <%} %> 
            <% for(int j = 0; j < (Global.BUILDINGS-boardManager.getBoard().getPlayerList().get(i).getBuildingOnBoard()); j++) { %>  
             <div id="<%=i %>building-<%=j %>"  class="drag building building-<%=boardManager.getBoard().getPlayerList().get(i).getColor().toLowerCase()%>" draggable="true"></div>
             <%} %>
             <button id="personality_card_<%=boardManager.getBoard().getPlayerList().get(i).getPersonalityCard() %>" style="position:relative;top:70px;" class="personality_card fadeandscale_open" alt="personality_cards/<%=boardManager.getBoard().getPlayerList().get(i).getPersonalityCard()  %>.png">Personality Card</button> 
            <% for(int j = 0; j < boardManager.getBoard().getPlayerList().get(i).getGreenPlayerCards().size(); j++) { System.out.println("Green Cards : "+boardManager.getBoard().getPlayerList().get(i).getGreenPlayerCards().get(j));%>
       			
      	 <div id="event_card_g<%=boardManager.getBoard().getPlayerList().get(i).getGreenPlayerCards().get(j) %>"  class="drag event_card fadeandscale_open" alt="green_cards/g<%=boardManager.getBoard().getPlayerList().get(i).getGreenPlayerCards().get(j)%>.png"></div>
       
        <% } %>
        </div>
        <% } %>
        
        
	 <div class="common used">
    	 <div class="title"> Used Cards</div>     
     </div>
        </div>
      
        
        
        <div id="fullboard"> 
        <button class="save_game" onclick="resend();"<%ankhMorPorkController.saveGame(boardManager.getBoard());%>>Save Game</button>
        <% for(int i=0;i<12;i++) {%>     
                <div id="area_<%=(i+1)%>" class="board_area"><%=ankhMorPorkController.getAreaDetails(i) %></div>			
             
         <%} %>            
        </div>
        </div>

		<script type="text/javascript">
		$('document').ready(init);
        function init(){
            $('.drag').bind('dragstart', function(event) {
                event.originalEvent.dataTransfer.setData("text/plain", event.target.getAttribute('id'));
            });
            
  		    // bind the dragover event on the board sections
            $('.player, .board_area').bind('dragover', function(event) {
                event.preventDefault();
            });
			
			// bind the drop event on the board sections
  			$('.player, .board_area').bind('drop', function(event) {
            var notecard = event.originalEvent.dataTransfer.getData("text/plain");
			event.target.appendChild(document.getElementById(notecard));
			//alert(notecard);
            //alert($(this).attr("id"));
			
			// Turn off the default behaviour
			// without this, FF will try and go to a URL with your id's name
            event.preventDefault();
			});
			
  			 // bind the dragover event on the board sections
            $('.event_card, .used').bind('dragover', function(event) {
                event.preventDefault();
            });
			
			// bind the drop event on the board sections
  			$('.event_card, .used').bind('drop', function(event) {
            var notecard = event.originalEvent.dataTransfer.getData("text/plain");
			event.target.appendChild(document.getElementById(notecard));
			//alert(notecard);
            //alert($(this).attr("id"));
			
			
            event.preventDefault();
			});

        }
		</script>

<!-- Fade & scale -->
<div id="fadeandscale" class="well">
  
  <div id="show_card"></div>
 
</div>

<script>
$(document).ready(function () {

  $('.fadeandscale_open').click(function(){
	  
	  $('#show_card').html("<img src='../images/"+$(this).attr('alt')+"' width='320'>");
  });
    $('#fadeandscale').popup({
        pagecontainer: '.container',
        transition: 'all 0.3s'
    });

});
</script>
        
	</body>
</body>
</html>