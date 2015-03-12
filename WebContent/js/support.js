var noOfPlayer=0;
var playername="";
function validate()
{
	//alert("Inside Validate Function"+document.forms[0].noOfPlayer.value);
	noOfPlayer=document.forms[0].noOfPlayer.value;
	
		$("#buttonId").hide();
		$("#noOfPlayer").hide();
		$("div.element").hide();
		var str="";
		  for (var i=1; i<=noOfPlayer;i++) {
			  	str +='<div>Enter Name of Player'+i+'</div>';
		        str += '<input type="text" name="name' + i + '" id="id' + i + '" value="Player' + i + '"/>';
		    }
		  
		  str+='<br><br>'+'<a href="#"><img id="buttonId" style="border:0px;" onclick="newgame();" src="http://images.webestools.com/buttons.php?frm=1&btn_type=43&txt=PLAY" onmouseover="this.src="http://images.webestools.com/buttons.php?frm=2&btn_type=43&txt=PLAY NOW" onmouseout="this.src="http://images.webestools.com/buttons.php?frm=1&btn_type=43&txt=PLAY";" alt="PLAY" /></a>'
		  //	str+='<br><br>'+'<img id="buttonId" style="border:0px;" onclick="../index.html" src="http://images.webestools.com/buttons.php?frm=1&btn_type=43&txt=PLAY"  alt="PLAY" />';
		    $('#container').html(str);
		  
		
	}
function validateResumeGame()
{
	var fileName=$("input").val();

	var jspcall = "../jsp/Play.jsp?fileName="+fileName+"&gameStatus=resume";
	window.location.href = jspcall;
	}
function newgame()
{
	for (var i=1; i<=noOfPlayer;i++) {
		var ident="#id"+i;
		playername=playername+$(ident).val()+",";
		
	}
	var jspcall = "../jsp/Play.jsp?noOfPlayer="+noOfPlayer+"&Playername="+playername+"&gameStatus=new";
    window.location.href = jspcall;
}