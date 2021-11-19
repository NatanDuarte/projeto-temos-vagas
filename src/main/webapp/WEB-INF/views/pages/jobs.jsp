<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="app/" var="path" />

<!DOCTYPE html>
<html>
    <head>
        <c:import url="../components/head.jsp" charEncoding="UTF-8"/>
        <title>Vagas disponíveis</title>
    </head>
    <body class="cyan lighten-5">
        <c:import url="../components/header.jsp" charEncoding="UTF-8"/>

        <main>
            <div class="container">
                <div class="row">

                    <c:forEach items="${jobs}" var="job">
                        <div class="col s12 m6">
                            <div class="card indigo darken-3 hoverable">
                                <div class="card-content white-text">
                                    <span class="card-title">${job.title}</span>
                                    <p>
                                        <c:if test="${job.type.equals('internship')}">
                                            Estágio
                                        </c:if>
                                        <c:if test="${job.type.equals('trainee')}">
                                            Trainee
                                        </c:if>
                                        <c:if test="${job.type.equals('freelancer')}">
                                            Freelancer
                                        </c:if>
                                        <c:if test="${job.type.equals('regular')}">
                                            Vaga comum
                                        </c:if>
                                    </p>
                                    <div class="divider"></div>
                                    <p class="card-content truncate">${job.description}</p>
                                </div>
                                <div class="card-action">
                                    <a href="app?action=JobPage&id=${job.id}">saiba mais</a>
                                </div>
                            </div>
                        </div>
                    </c:forEach>

                </div>
            </div>
        </main>
        
        <c:import url="../components/footer.jsp" charEncoding="UTF-8"/>
    </body>
</html>
