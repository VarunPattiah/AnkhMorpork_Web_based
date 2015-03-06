<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta  charset="UTF-8">
<title>Ankh Morpork</title>
<link rel = "stylesheet" type = "text/css" href= "../styles/global.css	">
<script type="text/javascript" src="../js/support.js"></script>
<script type="text/javascript" src="../js/jquery-1.9.1.min.js"></script>
</head>
<body  style="background-image: url(../images/Ankh1.jpg)">
<form action="" id="form1">
<div id = "header">
Welcome to DisckWorld : <a href="#">AnkhMorpork</a> 
</div>
<h1 align="center">Best of Luck with your New game</h1>
<br>
<div id="container" align="center">
<div class="element" id="noOfPlayerName">Enter the Number Of Player : </div><br>
<select id="noOfPlayer" >
    <option value="2">TWO</option>
    <option value="3">THREE</option>
    <option value="4">FOUR</option>
</select><br><br>
<a href="#"><img id="buttonId" style="border:0px;" onclick="validate();" src="http://images.webestools.com/buttons.php?frm=1&btn_type=43&txt=PLAY" onmouseover="this.src='http://images.webestools.com/buttons.php?frm=2&btn_type=43&txt=PLAY NOW'" onmouseout="this.src='http://images.webestools.com/buttons.php?frm=1&btn_type=43&txt=PLAY';" alt="PLAY" /></a>
<script type="text/javascript">
img=new Image();
img.src= "http://images.webestools.com/buttons.php?frm=2&btn_type=43&txt=PLAY";
</script>
</div>

</body>
</html>