<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <c:import url="../components/head.jsp" charEncoding="UTF-8"/>
    <title>Temos Vagas!</title>
</head>
<body class="cyan lighten-5">
    <c:import url="../components/header.jsp" charEncoding="UTF-8"/>

    <main>
        <section class="section deep-purple darken-2">
            <div class="row">
                <div class="col s12 m12 white-text">
                    <div class="container">
                        <h4>Empresa: ${loggedCompany.login}</h4>
                        <h5>CNPJ: ${loggedCompany.cnpj}</h5>
                    </div>
                </div>

                <div class="col m12 s12">
                    <div class="container">
                        <div class="center">
                            <a class="waves-effect waves-light indigo darken-4 btn-large left"
                            href="app?action=Logout">Sair</a>
                            <a class="waves-effect waves-light indigo lighten-2 btn-large right"
                            href="app?action=CreateNewJob">Criar Nova Vaga</a>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <section class="section">
            <div class="row">
                <div class="col s12 m12 grey-text">
                    <div class="container center">
                        <h4>Vagas criadas por <b>${loggedCompany.login}</b></h4>
                    </div>
                </div>

                <c:forEach items="${companyJobs}" var="job">
                <div class="col s12 m6">
                    <div class="center">
                        <div class="card indigo darken-3 hoverable left-align">
                            <div class="card-content white-text">
                                <span class="card-title">${job.title}</span>
                                <p>${job.type}</p>
                                <p class="card-content truncate">${job.description}</p>
                            </div>
                            <div class="card-action right-align">
                                <a href="app?action=UpdateJob&id=${job.id}">Editar</a>
                                <a 
                                    onclick="return confirm(
                                        'Tem certeza que quer deletar essa vaga?\n\(Essa opeação nao pode ser desfeita.)'
                                    );"
                                    href="app?action=DeleteJob&id=${job.id}">Deletar</a>
                            </div>
                        </div>
                    </div>
                </div>
                </c:forEach>
            </div>
        </section>
    </main>

    <c:import url="../components/footer.jsp" charEncoding="UTF-8"/>
</body>
</html>