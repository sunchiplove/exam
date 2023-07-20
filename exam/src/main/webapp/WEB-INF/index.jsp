<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<style>
	#insert{
		width:100%; height:200px; border:5px solid black;
	}
	#list{
		width:30%; height:500px; border:5px solid red;
		overflow:scroll;
		display : inline-block; float : left;
	}
	#findone{
		width:67%; height:500px; border:5px solid green;
		display : inline-block;
		
	}
</style>
<div id = "insert">
	<form action="/insert">

	<h1>연락처 입력</h1>
		<ul>
			<li>이름 : <input type="text" id="name" name="name"></li>
			<li>전화번호 : <input type="text" id="hp" name="hp"></li>
			<li>메모 : <input type="text" id="memo" name="memo"></li>
			<li><input type="submit" value="전화번호 저장"></li>
		</ul>

	</form>
</div>
<div id="main"></div>
<div id="list">
	<form action="/find">
		찾기 : <input type="text" id="search" name="search"><input type="submit" value="찾기">
	</form>
<table border="1">
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>내용</td>
			<td>가격</td>
		</tr>
	<c:forEach var="pb" items="${list }">
		<tr>
			<td>${pb.idx }</td>
			<td>${pb.name }</td>
			<td>${pb.hp }</td>
			<td>${pb.memo }</td>
		</tr>
	</c:forEach>
</table>

</div>
<div id="findone">
	<form action="/findone">
		검색하기 : <input type="text" id="idx" name="idx" placeholder="번호로 검색">
		<input type="submit" value="검색">
	</form>
	<hr>
		번호 : ${one.idx}<br>
		이름 : ${one.name}<br>
		전화번호 : ${one.hp}<br>
		메모 : ${one.memo}
	<hr>
	<form action="/update">
		<input type="text" id="idx" name="idx" placeholder="찾을 번호">
		<input type="text" id="name" name="name" placeholder="이름">
		<input type="text" id="hp" name="hp" placeholder="전화번호">
		<input type="text" id="memo" name="memo" placeholder="메모"><br>
		수정하기 : <input type="submit" value="수정">
	</form>
</div>
<div id="delete">
	<form action="/delete">
		삭제 : <input type="text" id="idx" name="idx" placeholder="삭제할 책 번호 입력">
		<input type="submit" value="삭제하기">
	</form>
</div>

