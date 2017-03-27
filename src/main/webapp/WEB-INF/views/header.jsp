<%@ page session="false"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url value="/#" var="home" />
<spring:url value="/exhibits/" var="exhome" />
<spring:url value="/excursions/" var="exurhome" />

<!-- Header -->
<nav class="navbar  navbar-inverse">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar"></button>
			<a class="navbar-brand" href="${home}">Museum</a>
		</div>
		<div id="navbar" class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="${home}">Home</a></li>
				<li><a href="${exhome}">Exhibits</a></li>
				<li><a href="${exurhome}">Excursions</a></li>
			</ul>
		</div>
	</div>
</nav>
<!-- Header -->