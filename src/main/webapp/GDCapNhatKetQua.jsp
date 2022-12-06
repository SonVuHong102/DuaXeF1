<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList, dao.*, model.*"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script>
	function goBack() {
		window.history.back()
	}
</script>
</head>
<body>
	<div class="center">
		<h1>Cập nhật kết quả</h1>

		<form action="SVChonChangDua">
			<h3>
				Chặng đua đã chọn :
				<c:out value="${changDuaDaChon.ten}" />
			</h3>
			<label for="giaiDua">Chọn chặng đua : </label> <select
				name="tblChangDuaid" id="tblChangDuaid">
				<c:forEach items="${listChangDua}" var="changDua">
					<c:choose>
						<c:when
							test="${changDuaDaChon != null && changDuaDaChon.id == changDua.id}">
							<option value="${changDua.id}" selected>${changDua.ten}</option>
						</c:when>
						<c:otherwise>
							<option value="${changDua.id}">${changDua.ten}</option>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</select> <input type="submit" value="Xác nhận">
		</form>
		<c:set var="listChangDua" scope="session" value="${listChangDua}" />
		<br> <br>
		<form action="SVLuuKetQua" method="post">
			<table>
				<tr>
					<th>STT</th>
					<th>Tên</th>
					<th>Đội đua</th>
					<th>Hoàn thành</th>
					<th>Thời gian (hh:mm:ss)</th>
					<th>Số vòng</th>
				</tr>
				<c:set var="count" value="1" scope="page" />
				<c:forEach items="${listKetQuaTayDua}" var="ketQuaTayDua">
					<tr>
						<td><c:out value="${count}" /></td>
						<c:set var="count" value="${count + 1}" scope="page" />
						<td><c:out value="${ketQuaTayDua.tayDuaDaDangKy.tayDua.ten}" /></td>
						<td><c:out
								value="${ketQuaTayDua.tayDuaDaDangKy.tayDua.doiDua.ten}" /></td>
						<td><select
							name="suKien_tayDuaDaDangKy${ketQuaTayDua.tayDuaDaDangKy.id}"
							id="suKien_tayDuaDaDangKy${ketQuaTayDua.tayDuaDaDangKy.id}">
								<c:choose>
									<c:when
										test="${ketQuaTayDua.suKien != null && ketQuaTayDua.suKien == \"0\"}">
										<option value="0" selected>Hoàn thành</option>
									</c:when>
									<c:otherwise>
										<option value="0">Hoàn thành</option>
									</c:otherwise>
								</c:choose>
								<c:choose>
									<c:when
										test="${ketQuaTayDua.suKien != null && ketQuaTayDua.suKien == \"1\"}">
										<option value="1" selected>Bỏ cuộc</option>
									</c:when>
									<c:otherwise>
										<option value="1">Bỏ cuộc</option>
									</c:otherwise>
								</c:choose>
								<c:choose>
									<c:when
										test="${ketQuaTayDua.suKien != null && ketQuaTayDua.suKien == \"2\"}">
										<option value="2" selected>Tai nạn</option>
									</c:when>
									<c:otherwise>
										<option value="2">Tai nạn</option>
									</c:otherwise>
								</c:choose>
						</select></td>
						<td><input type="text"
							id="thoiGian_tayDuaDaDangKy${ketQuaTayDua.tayDuaDaDangKy.id}"
							name="thoiGian_tayDuaDaDangKy${ketQuaTayDua.tayDuaDaDangKy.id}"
							value="${ketQuaTayDua.thoiGianHoanThanhStr}"
							pattern="([01]?[0-9]{1}|2[0-3]{1}):[0-5]{1}[0-9]{1}:[0-5]{1}[0-9]{1}"
							placeholder="hh:mm:ss"></td>
						<td><input type="number"
							id="soVong_tayDuaDaDangKy${ketQuaTayDua.tayDuaDaDangKy.id}"
							name="soVong_tayDuaDaDangKy${ketQuaTayDua.tayDuaDaDangKy.id}"
							value="${ketQuaTayDua.soVongHoanThanh}" pattern="^\d+$" min="0"
							max="${changDuaDaChon.soVongDua}"></td>
					</tr>
				</c:forEach>
			</table>
			<br> <br> 
			<button type="button" onclick="goBack()">Back</button>
			<input type="reset" value="Reset" /> 
			<input type="submit" value="Submit" />
		</form>
		<c:set var="listKetQuaTayDua" scope="session"
			value="${listKetQuaTayDua}" />
			<%
				Object kqObj = request.getAttribute("kq");
				if(kqObj == null) {
					return;
				}
				boolean kq = (boolean) kqObj;
				if(kq == true) {
					%>
					<script type="text/javascript">
					alert("Lưu thành công!");
					</script>
					<%
				} else if(kq == false) {
					%>
					<script type="text/javascript">
					alert("Lưu lỗi!");
					history.back();
					</script>
					<%
				}
			%>
	</div>
</body>
</html>