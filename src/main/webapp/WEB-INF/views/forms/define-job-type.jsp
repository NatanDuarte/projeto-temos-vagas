<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="app" var="path" />
<!DOCTYPE html>
<html>
    <head>
        <c:import url="../components/head.jsp" charEncoding="UTF-8"/>
        <title>Criar nova vaga</title>
    </head>
    <body>
        <c:import url="../components/header.jsp" charEncoding="UTF-8"/>

        <main>
            <form action="${path}" method="POST">

                <div class="container">
                    <h4>Tipo de vaga</h4>
                </div>
                <div class="section container row">
                    <div class="col s6 m6">
                        <div class="input-field center">
                            <select name="jobType" id="job-type">
                                <option disabled selected>defina o tipo</option>
                                <option value="regular">regular</option>
                                <option value="internship">estágio</option>
                                <option value="trainee">trainee</option>
                                <option value="freelancer">freelancer</option>
                            </select>
                            <label>Tipos de vaga</label>
                        </div>
                    </div>
                    <input type="hidden" name="action" value="EvaluateJobType">

                    <input type="hidden" name="id" value="${loggedCompany.id}">
                    <div class="col s6 m6">
                        <button type="submit" class="waves-effect right waves-light btn-large center indigo darken-1">
                            continuar
                        </button>
                    </div>
                </div>
            </form>
        </main>

        <c:import url="../components/footer.jsp" charEncoding="UTF-8"/>
        <script src="./src/js/job-type-dynamic.js"></script>
    </body>
</html>
