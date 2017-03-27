<%@ page session="false"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url value="/exhibits/all" var="all" />
<spring:url value="/exhibits/author" var="byAuthor" />
<spring:url value="/exhibits/material" var="byMaterial" />
<spring:url value="/exhibits/technique" var="byTechnique" />
<spring:url value="/exhibits/worker" var="byWorker" />
<spring:url value="/exhibits/hall" var="byHall" />

<ul class="nav nav-pills nav-stacked">
	<li role="presentation"><a href="${all}">All exhibits</a></li>
	<li role="presentation"><a href="${byAuthor}">Find by author</a></li>
	<li role="presentation"><a href="${byMaterial}">Find by material</a></li>
	<li role="presentation"><a href="${byTechnique}">Find by technique</a></li>
	<li role="presentation"><a href="${byWorker}">Find by worker</a></li>
	<li role="presentation"><a href="${byHall}">Find by hall</a></li>
</ul>








