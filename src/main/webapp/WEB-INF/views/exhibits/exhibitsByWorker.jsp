<%@ page session="false"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url value="/exhibits/worker" var="byWorker" />


<html>
<jsp:include page="../headerProp.jsp"></jsp:include>
<body>
	<jsp:include page="../header.jsp"></jsp:include>

	<!-- Page content -->
	<div class="container">
		<div class="row">
			<div class="col-xs-9">
				<h2>Enter worker name:</h2>
				<form method="post" action="${byWorker}">
					<p>
						<input type="text" value="" name="worker" required="required" />
					</p>
					<p>
						<input type="submit" />
					</p>
				</form>
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