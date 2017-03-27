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
<jsp:include page="../headerProp.jsp"></jsp:include>
<body>
	<jsp:include page="../header.jsp"></jsp:include>




	<!-- Page content -->
	<div class="container">
		<div class="row">
			<div class="col-xs-9">
				<h2 class="w3-wide">Exhibits by material name: ${material}</h2>

				<c:choose>
					<c:when test="${not empty exhibits}">
						<table>
							<thead>
								<tr class="w3-light-grey">
									<th>Name</th>
									<th>Material</th>
									<th>Technique</th>
									<th>Hall</th>
								</tr>
							</thead>
							<c:forEach items="${exhibits}" var="current">
								<tr>
									<td>${current.name}</td>
									<td>${current.material}</td>
									<td>${current.technique}</td>
									<td>${current.hall.name}</td>
								</tr>
							</c:forEach>
						</table>
					</c:when>
					<c:otherwise>
						<h4>not found!</h4>
						<p>Try another one name:</p>

						<form method="post" action="${byMaterial}">
							<p>
								<input type="text" value="" name="material" />
							</p>
							<p>
								<input type="submit" />
							</p>
						</form>
					</c:otherwise>
				</c:choose>
			</div>
			<div class="col-xs-3"><jsp:include page="../menu.jsp"></jsp:include></div>
		</div>

		<!-- Foter -->
		<div class="footer">
			<p>Footer</p>
		</div>

	</div>

</body>
</html>
