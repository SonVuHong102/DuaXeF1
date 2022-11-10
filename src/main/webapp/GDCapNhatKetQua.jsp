<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList, dao.*, model.*"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="center">
		<h1>Cập nhật kết quả</h1>

		<form action="SVChonChangDua">
			<label for="giaiDua">Chọn chặng đua : </label> <select
				name="tblChangDuaid" id="tblChangDuaid">
				<c:forEach items="${listChangDua}" var="o">
					<option value="${o.id}">${o.ten}</option>
				</c:forEach>
			</select> <input type="submit" value="Xác nhận">
		</form>
		<br>
		<br>
		<table>
			<tr>
				<th>STT</th>
				<th>Tên</th>
				<th>Đội đua</th>
				<th>Hoàn Thành</th>
				<th>Thời gian</th>
				<th>Số vòng</th>
			</tr>
			<tr>
				<td>Alfreds Futterkiste</td>
				<td>Maria Anders</td>
				<td>Germany</td>
				<td><select name="tblChangDuaid" id="tblChangDuaid">
						<option value="aa">aa</option>
						<option value="bb">bb</option>
						<option value="cc">cc</option>
				</select></td>
				<td>Germany</td>
				<td>Germany</td>
			</tr>
		</table>
	</div>
</body>
</html>