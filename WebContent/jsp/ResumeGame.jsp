<%--
 * @author Varun Pattiah
 * Feb 25, 2015
 * 2:16:36 PM
 * 2015
 * @email: varunpattiah@gmail.com
 --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta  charset="UTF-8">
<title>Ankh Morpork</title>
<link rel = "stylesheet" type = "text/css" href= "../styles/global.css	">
<script type="text/javascript" src="../js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="../js/support.js"></script>
</head>
<body  style="background-image: url(../images/Ankh1.jpg)">
<form action="" id="form1">
<div id = "header">
Welcome to DisckWorld : <a href="#">AnkhMorpork</a> 
</div>
<h1 align="center">Best of Luck with your game</h1>
<br>
<div id="container" align="center">
<div class="element" id="noOfPlayerName">Upload the state of the Game : </div><br>
<input type="file" name="datafile" size="40">
 <br><br>
<a href="#"><img id="buttonId" style="border:0px;" onclick="validateResumeGame();" src="http://images.webestools.com/buttons.php?frm=1&btn_type=43&txt=PLAY" onmouseover="this.src='http://images.webestools.com/buttons.php?frm=2&btn_type=43&txt=PLAY NOW'" onmouseout="this.src='http://images.webestools.com/buttons.php?frm=1&btn_type=43&txt=PLAY';" alt="PLAY" /></a>
<script type="text/javascript">
img=new Image();
img.src= "http://images.webestools.com/buttons.php?frm=2&btn_type=43&txt=PLAY";
</script>
</div>

</body>
</html>