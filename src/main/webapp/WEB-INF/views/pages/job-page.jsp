<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="app/" var="path" />

<!DOCTYPE html>
<html>
    <head>
        <c:import url="../components/head.jsp" charEncoding="UTF-8"/>
        <title>Vaga: ${job.title}</title>
    </head>
    <c:import url="../components/header.jsp" charEncoding="UTF-8"/>

    <body class="cyan lighten-5">

        <main>
            <div class="container">
                <div class="card row">
                    <p class="card-title center">Vaga: ${job.title}</p>

                    <!-- a formatacao abaixo IMPORTA -->

                    <div class="container">
                        <p class="card-content multline"><b>Descrição:</b>
<c:out value="${job.description}"/></p>
                        <p class="card-content multline"><b>Requisitos mínimos:</b>
${job.metadata.minimumRequirements}</p>

                        <c:if test="${job.type.equals('internship')}">
                            <p class="multline card-content">* Estar cursando pelo menos o ${job.metadata.courseSemester}º semestre do curso</p>
                        </c:if>

                        <c:if test="${job.type.equals('trainee')}">
                            <p class="card-content multline">* Ter concluído a graduação em ${job.metadata.graduationYear}</p>
                        </c:if>

                        <c:if test="${job.type.equals('freelancer')}">
                            <p class="card-content multline">Dias de disponibilidade: ${job.metadata.availableDays} dias</p>
                        </c:if>

                        <p class="card-content"><b>Benefícios:</b><br>
${job.metadata.benefits}</p>
                    </div>

                    <div class="card-action">
                        <div class="container">
                            <a class="btn-large right deep-purple darken-2" 
                               href="app?action=ApplyForJob&id=${job.id}">Candidatar-se</a>
                        </div>
                    </div>
                </div>
            </div>
        </main>

        <c:import url="../components/footer.jsp" charEncoding="UTF-8"/>
    </body>
</html>
