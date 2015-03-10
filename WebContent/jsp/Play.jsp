<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.concordia.ankhMorPork.manager.BoardManager" %>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="../css/style.css" rel="stylesheet" type="text/css">  
<script type="text/javascript" src="../js/jquery-1.9.1.min.js"></script>
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
      
      <div id="personality_card_1" class="drag personality_card" draggable="true"></div> 
      <div id="personality_card_2" class="drag personality_card" draggable="true"></div> 
      <div id="personality_card_3" class="drag personality_card" draggable="true"></div> 
      <div id="personality_card_4" class="drag personality_card" draggable="true"></div> 
      <div id="personality_card_5" class="drag personality_card" draggable="true"></div> 
      <div id="personality_card_6" class="drag personality_card" draggable="true"></div> 
      <div id="personality_card_7" class="drag personality_card" draggable="true"></div> 
     
      <div id="event_card_b1" class="drag event_card" draggable="true"></div>
      <div id="event_card_g1" class="drag event_card" draggable="true"></div>
      <div id="event_card_g2" class="drag event_card" draggable="true"></div>
      <div id="event_card_g3" class="drag event_card" draggable="true"></div>
      <div id="event_card_g4" class="drag event_card" draggable="true"></div>
      <div id="event_card_g5" class="drag event_card" draggable="true"></div>
      <div id="event_card_g6" class="drag event_card" draggable="true"></div>
      <div id="event_card_g7" class="drag event_card" draggable="true"></div> 
     
     
     
            
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
             <div id="personality_card_<%=boardManager.getBoard().getPlayerList().get(i).getPersonalityCard() %>" class="drag personality_card" draggable="true"></div> 
            
        
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
	</body>
</body>
</html>