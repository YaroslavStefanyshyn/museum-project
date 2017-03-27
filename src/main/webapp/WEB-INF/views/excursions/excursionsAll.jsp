<%@ page session="false"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>



<spring:url value="/exhibits/all" var="all" />
<html>
<jsp:include page="../headerProp.jsp"></jsp:include>
<body>
	<jsp:include page="../header.jsp"></jsp:include>

	<!-- Page content -->

	<div class="container">
		<div class="row">
			<div class="col-xs-9">
				<c:if test="${not empty excursions}">
					<table>
						<thead>
							<tr class="">
								<th>Name</th>
								<th>Author</th>
								<th>Material</th>
								<th>Technique</th>
								<th>Hall</th>
							</tr>
						</thead>
						<c:forEach items="${exhibits}" var="current">
							<tr>
								<td>${current.name}</td>
								<td>${current.author.firstName}</td>
								<td>${current.material}</td>
								<td>${current.technique}</td>
								<td>${current.hall.name}</td>
							</tr>
						</c:forEach>
					</table>
				</c:if>
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
