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
     
	<% Integer noOfPlayer=Integer.parseInt(request.getParameter("noOfPlayer"));
	   String playerNamelist=request.getParameter("Playername");	
	   String[] playerlist=playerNamelist.split(",");
	   BoardManager boardManager=ankhMorPorkController.initializeNewGame(noOfPlayer,playerNamelist);

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
       			
       <div id="city_area_card_<%=boardManager.getBoard().getCityAreaCard().get(j) %>" ></div>
       
        <% } %> 
      <% for(int j = 0; j < boardManager.getBoard().getRandomEventCard().size(); j++) { System.out.println("RandomEventCard : "+boardManager.getBoard().getRandomEventCard().get(j));%>
       			
       <div id="random_event_card_<%=boardManager.getBoard().getRandomEventCard().get(j) %>" ></div>
       
        <% } %> 
     
     
            
     </div>
     <div class="clear"></div>
     
     
	 <% for(int i = 0; i < noOfPlayer; i++) { %>
	   
       
        <div class="player">
        	<div class="title"> <%=playerlist[i] %></div>
            <div id="minion-1" class="drag minion minion-<%=boardManager.getBoard().getPlayerList().get(i).getColor().toLowerCase()%>" draggable="true"></div>
            <div id="minion-2" class="drag minion minion-<%=boardManager.getBoard().getPlayerList().get(i).getColor().toLowerCase()%>" draggable="true"></div>
            <div id="minion-3" class="drag minion minion-<%=boardManager.getBoard().getPlayerList().get(i).getColor().toLowerCase()%>" draggable="true"></div>
            
             <div id="building-1" class="drag building building-<%=boardManager.getBoard().getPlayerList().get(i).getColor().toLowerCase()%>" draggable="true"></div>
            <div id="building-2" class="drag building building-<%=boardManager.getBoard().getPlayerList().get(i).getColor().toLowerCase()%>" draggable="true"></div>
            <div id="building-3" class="drag building building-<%=boardManager.getBoard().getPlayerList().get(i).getColor().toLowerCase()%>>" draggable="true"></div>   
             <button id="personality_card_<%=boardManager.getBoard().getPlayerList().get(i).getPersonalityCard() %>"  class="personality_card fadeandscale_open" alt="personality_cards/<%=boardManager.getBoard().getPlayerList().get(i).getPersonalityCard() %>.png">Personality Card</button> 
            <% for(int j = 0; j < boardManager.getBoard().getPlayerList().get(i).getGreenPlayerCards().size(); j++) { System.out.println("Green Cards : "+boardManager.getBoard().getPlayerList().get(i).getGreenPlayerCards().get(j));%>
       			
       <div id="event_card_g<%=boardManager.getBoard().getPlayerList().get(i).getGreenPlayerCards().get(j) %>" ></div>
       
        <% } %>
        </div>
        <% } %>
        </div>
      
        
        
        <div id="fullboard">        
                <div id="area_1" class="board_area"></div>			
                <div id="area_2" class="board_area"></div>        
                <div id="area_3" class="board_area"></div> 
                <div id="area_4" class="board_area"></div>			
                <div id="area_5" class="board_area"></div>        
                <div id="area_6" class="board_area"></div> 
                <div id="area_7" class="board_area"></div>			
                <div id="area_8" class="board_area"></div>        
                <div id="area_9" class="board_area"></div> 
                <div id="area_10" class="board_area"></div>			
                <div id="area_11" class="board_area"></div>        
                <div id="area_12" class="board_area"></div>              
        </div>
        </div>
		
        <script type="text/javascript" src="http://code.jquery.com/jquery-1.4.2.min.js">
        </script>

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