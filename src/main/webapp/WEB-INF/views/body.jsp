<%@ page session="false"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url value="/#" var="home" />
<spring:url value="/exhibits/all" var="all" />
<spring:url value="/exhibits/author" var="byAuthor" />
<spring:url value="/exhibits/material" var="byMaterial" />
<spring:url value="/exhibits/technique" var="byTechnique" />

<html>
<jsp:include page="headerProp.jsp"></jsp:include>
<body>
	<jsp:include page="header.jsp"></jsp:include>


	<!-- Page content -->
	<div class="container">
		<div class="row">
			<div class="col-xs-9">
				<h2>Museum home page</h2>
			</div>
			<div class="col-xs-3"><jsp:include page="menu.jsp"></jsp:include></div>
		</div>
		<!-- Page content -->

		<!-- Footer -->
		<div class="footer">
			<p>Footer</p>
		</div>

	</div>
</body>
</html>