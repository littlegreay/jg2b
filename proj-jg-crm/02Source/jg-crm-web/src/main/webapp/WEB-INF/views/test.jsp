<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script type="text/javascript" src='<c:url value="/js/jquery.js"></c:url>'></script> 
<script type="text/javascript">
	$(document).ready(function() {
		alert("123");
	});
</script>
<title>Insert title here</title>
</head>
<body>
	<a>id： ${list}</a>
	<br/>
	
	 <c:forEach var="testBean" items="${list}" varStatus="status">
     id: ${testBean.ID} , name: ${testBean.name}
     <br/>

    </c:forEach>
</body>
</html>