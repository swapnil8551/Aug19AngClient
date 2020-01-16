<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<sp:form method="post" modelAttribute="user">
		<table style="background-color: cyan; margin: auto;" border="1">
			<tr>
				<td>Your ID(R)</td>
				<td><sp:input path="id" readonly="true" /></td>
			</tr>
			<%--IMPORTANT --%>
				<sp:hidden path="version" />
			
			<tr>
				<td>Enter User Email(R)</td>
				<td><sp:input path="email" readonly="true" /></td>
			</tr>
			<tr>
				<td>Enter User Name</td>
				<td><sp:input path="name" /></td>
			</tr>

			<tr>
				<td>Enter User Password</td>
				<td><sp:password path="password" showPassword="true" /></td>
			</tr>
			<tr>
				<td>Enter Reg Amount</td>
				<td><sp:input type="number" path="regAmount" /></td>
			</tr>
			<tr>
				<td>Enter Reg Date</td>
				<td><sp:input type="date" path="regDate" /></td>
			</tr>
			<tr>
				<td>Choose Role</td>
				<td><sp:radiobuttons path="role"
						items="${requestScope.user_roles}" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update Details" /></td>
			</tr>
		</table>
	</sp:form>

</body>
</html>
