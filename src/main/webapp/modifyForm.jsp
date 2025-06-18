<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>주소록</h1>
	
		<h2>전화번호 수정폼</h2>
		<p>전화번호를 수정하는 폼 입니다.</p>
	
		<form action="http://localhost:8080/phonebook2/pbc"  method="get">
			<label>이름(name)</label>
			<input type="text" name="name" value="">
			<br>
		
			<label>핸드폰(hp)</label>
			<input type="text" name="hp" value="">
			<br>
	
			<label>회사(company)</label>
			<input type="text" name="company" value="">
			<br>
						
			<label>아이디(person_id)</label>
			<input type="text" name="person_id" value="">
			<br>
			
			<label>액션: </label>
			<input type = "hidden" name = "action"  value = "modify">
			
			<button>수정</button>
		</form>
	
	</body>
</html>