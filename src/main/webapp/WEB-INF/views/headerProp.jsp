<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<spring:url value="/resources/css/bootstrap.min.css" var="bs" />
<spring:url value="/resources/css/bootstrap-theme.min.css" var="bstm" />
<spring:url value="/resources/css/index.css" var="index" />

<head>
	<title>zMuseum</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="${bs}">
	<link rel="stylesheet" href="${bstm}">
	<link rel="stylesheet" href="${index}">
</head>