<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="../css/style.css" rel="stylesheet" type="text/css">  
<title>Insert title here</title>
</head>
<body>
	<body>
    
     <div id="board">
     
	<% Integer noOfPlayer=Integer.parseInt(request.getParameter("noOfPlayer")); %>
	noOfPlayer = <%=noOfPlayer %>
    
    <div id="players">
	 <% for(int i = 0; i < noOfPlayer; i+=1) { %>
	   
       
        <div class="player">
        	<div class="title"> Objects</div>
            <div id="minion-1" class="minion minion-red" draggable="true"></div>
            <div id="minion-2" class="minion minion-red" draggable="true"></div>
            <div id="minion-3" class="minion minion-red" draggable="true"></div>
            
             <div id="building-1" class="building building-red" draggable="true"></div>
            <div id="building-2" class="building building-red" draggable="true"></div>
            <div id="building-3" class="building building-red" draggable="true"></div>   
            
             <div id="dollor-1" class="dollor" draggable="true"></div> 
             <div id="trouble-1" class="trouble" draggable="true"></div> 
        
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
            $('.minion, .building, .dollor, .trouble').bind('dragstart', function(event) {
                event.originalEvent.dataTransfer.setData("text/plain", event.target.getAttribute('id'));
            });
            
  		    // bind the dragover event on the board sections
            $('.player, .board_area, .dollor, .trouble').bind('dragover', function(event) {
                event.preventDefault();
            });
			
			// bind the drop event on the board sections
  			$('.player, .board_area, .dollor, .trouble').bind('drop', function(event) {
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