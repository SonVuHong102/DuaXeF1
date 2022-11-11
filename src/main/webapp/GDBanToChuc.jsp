<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList, dao.*, model.*"%>
<!DOCTYPE html>
<html>
<head>
	<link href="css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
	<div class="center">
		<h1>Trang chủ ban tổ chức</h1>

		<form action="SVCapNhatKetQua">
			<label for="giaiDua">Chọn giải đua : </label> <select
				name="tblGiaiDuaid" id="giaiDua">
				<c:forEach items="${listGiaiDua}" var="o">
					<option value="${o.id}">${o.ten}-${o.muaGiai}</option>
				</c:forEach>
			</select> <br> <br>
			<button type="button">Xem kết quả</button>
			<input type="submit" value="Submit">
		</form>
	</div>
</body>
</html>