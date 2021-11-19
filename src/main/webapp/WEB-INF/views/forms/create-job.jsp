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
            <section class="section container">
                <form action="${path}" method="POST">

                    <div class="row">
                        <div class="row">
                            <div class="col s12">
                                <input placeholder="Título da vaga" type="text" name="title" class="validate" required>

                                <textarea name="description" class="materialize-textarea"></textarea>
                                <label for="description">Descrição da vaga</label>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="row">
                            <div class="col s12">
                                <c:import url="${importPath}" charEncoding="UTF-8"/>

                                <div class="input-field">
                                    <textarea name="benefits" class="materialize-textarea"></textarea>
                                    <label for="benefits">Benefícios</label>
                                </div>

                                <div class="input-field">
                                    <textarea name="minimum-requirements" class="materialize-textarea"></textarea>
                                    <label for="minimum-requirements">Requisitos mínimos</label>
                                </div>
                            </div>
                        </div>
                    </div>

                    <input type="hidden" name="companyId" value="${loggedCompany.id}">
                    <input type="hidden" name="jobType" value="${jobType}">

                    <input type="hidden" name="action" value="Create">

                    <div class="row">
                        <button type="submit" 
                                class="waves-effect right waves-light btn-large center indigo darken-1">
                            confirmar
                        </button>
                    </div>

                </form>
            </section>
        </main>

        <c:import url="../components/footer.jsp" charEncoding="UTF-8"/>
        <script src="./src/js/job-type-dynamic.js"></script>
    </body>
</html>
