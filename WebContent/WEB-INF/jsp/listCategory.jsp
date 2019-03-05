<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>category</title>
<style type="text/css">
 
        table {
            border: 1px solid red;
            border-collapse: collapse;
            text-align:center;
        }
        td {
            border: 1px solid red;
		}
	</style>
</head>
<body>
<table>
    <tr>
        <td>id</td>
        <td>name</td>
    </tr>
    <c:forEach items="${cs}" var="c" varStatus="st">
        <tr>
            <td>${c.id}</td>
            <td>${c.name}</td>
               
        </tr>
    </c:forEach>
</table>
</body>
</html>