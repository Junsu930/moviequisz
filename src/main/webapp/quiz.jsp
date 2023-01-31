<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src = "http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">

function fn_process(){
	

	var answer1 = $("#movieName1").val();
	
	
	if (answer1 == '반지의 제왕' || answer1 == '반지의제왕'){
		$('#message').text("정답입니다.");
		answer1.submit();
		
	} else{
		$('#message').text("틀렸습니다.");
	}

}
</script>
<title>퀴즈1</title>
</head>
<body>
<form action = "movie" method = "post">
<img src = "image/common.jpg" width="400"><br>
영화의 제목은<input type="text" id = "movieName1" /><br>
<input type = "button" value = "전송" onclick="fn_process()"/><br><br>
<div id = "message"></div>
</form>
</html>